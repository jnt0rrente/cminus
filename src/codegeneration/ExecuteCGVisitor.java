package codegeneration;


import ast.*;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.FunctionInvocation;
import ast.expression.Variable;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * //Statements
 * execute[[Assignment: statement -> expression1 expression2]] =
 * 	    address[[expression1]]
 * 	    value[[expression2]]
 * 	    <store > + expression1.type.suffix()
 *
 * execute[[Write: statement -> expression]] =
 *  	value[[expression]]
 *  	<out > expression.type.suffix()
 *
 * execute[[Read: statement -> expression]] =
 *  	address[[expression]]
 *  	<in > expression.type.suffix()
 *
 * execute[[While: statement -> expression statement*]] =
 *     String conditionLabel = cg.nextLabel(),
 *     exitLabel = cg.nextLabel();
 *     conditionLabel <:>
 *     value[[expression]]
 *     <jz > exitLabel
 *     statement*.forEach(st -> execute[[st]](int returnBytes, int localVarBytes, int paramBytes));
 *     <jmp > conditionLabel
 *     exitLabel <:>
 *
 * execute[[IfElse: statement -> expression statement1* statement2*]](int returnBytes, int localVarBytes, int paramBytes) =
 *     String exitLabel = cg.nextLabel();
 *     String elseLabel = cg.nextLabel();
 *     value[[expression]]
 *     <jz > elseLabel
 *     statement1*.forEach(st -> execute[[st]](int returnBytes, int localVarBytes, int paramBytes));
 *     <jmp > exitLabel
 *     elseLabel <:>
 *     statement2*.forEach(st -> execute[[st]](int returnBytes, int localVarBytes, int paramBytes));
 *     exitLabel <:>
 *
 * execute[[FunctionInvocation: statement -> expression expression*]] =
 *     for (Expression e : expression*) {
 *         value[[e]];
 *     }
 *     <call > expression.getIdentifier();
 *     Type returnType = expression.getType().getReturnType();
 *     if (returnType != null) <pop > returnType().suffix()
 *
 * execute[[Return: statement -> expression]](int returnBytes, int localVarBytes, int paramBytes) =
 *     <ret > returnbytes <,> localVarBytes <,> paramBytes
 *     push	bp
 * 	pushi	-5 TODO
 * 	addi
 * 	loadb
 * 	b2i
 *
 * //Definitions
 * execute[[FunctionDefinition: definition -> type ID definition* statement*]] =
 * 	    ID <:>
 * 	    cg.comment("Parameters")
 * 	    for (int i = 0; i < type.parameters.size(); i++) {
 * 		    execute[[type.parameters.get(i)]]
 *      }
 * 	    cg.comment("Local variables")
 * 	    for (int i = 0; i < definition*.size(); i++) {
 * 		    execute[[definition*.get(i)]]
 *      }
 * 	    <enter > definition*.get(definition*.size()-1).offset
 *
 * 	    int localVarBytes = definition.localVariables.stream().mapToInt(var -> var.type.numberOfBytes).sum()
 *      int paramBytes = type.parameters.stream().mapToInt(parameter -> parameter.type.numberOfBytes).sum()
 *
 * 	    statement*.forEach(statement -> execute[[statement]](definition.getType().numberOfBytes, localVarBytes, paramBytes))
 *
 *  	if (type.returnType instanceof VoidType) {
 * 		    <ret > 0, localVarBytes, paramBytes
 *      }
 *
 * execute[[VariableDefinition: definition -> type ID]] =
 * 	    cg.comment(type.getSimpleName() + " " + ID + " (offset " + definition.offset+")")
 *
 * execute[[Program: program -> definition*]] =
 * 	    <call main>
 * 	    <halt>
 * 	    program.definitions.forEach(def -> execute[[def]]);
 *
 */
public class ExecuteCGVisitor extends AbstractCGVisitor<ReturnSizesDTO, Void> {
    AddressCGVisitor addressCGVisitor;
    ValueCGVisitor valueCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public ExecuteCGVisitor(AddressCGVisitor addressCGVisitor, ValueCGVisitor valueCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(WhileLoop whileLoop, ReturnSizesDTO param) {
        cg.shortComment("WhileLoop");
        String conditionLabel = cg.nextLabel();
        String exitLabel = cg.nextLabel();

        cg.label(conditionLabel);
        whileLoop.getCondition().accept(valueCGVisitor, null);
        cg.jz(exitLabel);

        whileLoop.getBody().forEach(statement -> statement.accept(this, param));
        cg.jmp(conditionLabel);

        cg.label(exitLabel);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, ReturnSizesDTO param) {
        String exitLabel = cg.nextLabel();
        String elseLabel = cg.nextLabel();
        cg.shortComment("If:");

        ifElse.getCondition().accept(valueCGVisitor, null);

        cg.jz(elseLabel);

        cg.shortComment("Then:");
        ifElse.getBody().forEach(statement -> statement.accept(this, param));

        cg.jmp(exitLabel);

        cg.shortComment("Else:");
        cg.label(elseLabel);
        ifElse.getBodyElse().forEach(statement -> statement.accept(this, param));

        cg.label(exitLabel);
        return null;
    }

    @Override
    public Void visit(Program program, ReturnSizesDTO param) {
        cg.writeProgramName();
        Collection<Definition> definitions = program.getDefinitions();
        List<Definition> functionDefs = new ArrayList<Definition>();
        for (Definition def : definitions) {
            if (def instanceof VariableDefinition) {
                def.accept(this, param);
            } else {
                functionDefs.add(def);
            }
        }
        cg.shortComment("Calling the main function.");
        cg.call("main", false);
        cg.halt();
        for (Definition def : functionDefs) {
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(Assignment assignment, ReturnSizesDTO param) {
        assignment.getLHS().accept(addressCGVisitor, null);
        assignment.getRHS().accept(valueCGVisitor, null);
        cg.store(assignment.getLHS().getType().suffix());
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, ReturnSizesDTO param) {
        cg.line(functionDefinition.getLine());
        cg.label(functionDefinition.getName());
        cg.shortComment("Parameters:");
        ((FunctionType) functionDefinition.getType()).getParameterVariableDefinitions().forEach(paramDef -> paramDef.accept(this, param));
        cg.shortComment("Local variables:");
        functionDefinition.getBodyVariableDefinitions().forEach(paramDef -> paramDef.accept(this, param));

        if (functionDefinition.getBodyVariableDefinitions().size() > 0) {
            cg.enter(functionDefinition
                    .getBodyVariableDefinitions()
                    .get(functionDefinition.getBodyVariableDefinitions().size() - 1)
                    .getOffset() * -1); //offset of last variable definition
        } else {
            cg.enter(0);
        }
        int variablesSize = functionDefinition.getBodyVariableDefinitions()
                .stream().mapToInt(varDef -> varDef.getType().numberOfBytes()).sum();

        int parametersSize = ((FunctionType) functionDefinition.getType()).getParameterVariableDefinitions()
                .stream().mapToInt(paramDef -> paramDef.getType().numberOfBytes()).sum();

        ReturnSizesDTO functionReturnSizes = new ReturnSizesDTO(
                ((FunctionType) functionDefinition.getType()).getReturnType().numberOfBytes(),
                variablesSize,
                parametersSize
                );
        for (Statement statement : functionDefinition.getBodyStatements()) {
            cg.line(statement.getLine());
            statement.accept(this, functionReturnSizes);
        }

        if (((FunctionType) functionDefinition.getType()).getReturnType() instanceof VoidType) {
            cg.ret(0, variablesSize, parametersSize);
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, ReturnSizesDTO param) {
        cg.longComment(variableDefinition.getType().getTypeName() + " " + variableDefinition.getName() + " (offset " + variableDefinition.getOffset() + ")");
        return null;
    }

    @Override
    public Void visit(Read read, ReturnSizesDTO param) {
        cg.shortComment("Read");
        read.getReadVal().accept(addressCGVisitor, null);
        cg.in(read.getReadVal().getType().suffix());
        cg.store(read.getReadVal().getType().suffix());
        return null;
    }

    @Override
    public Void visit(Write write, ReturnSizesDTO param) {
        cg.shortComment("Write");
        write.getWriteVal().accept(valueCGVisitor, null);
        cg.out(write.getWriteVal().getType().suffix());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, ReturnSizesDTO param) {
        for (Expression e : functionInvocation.getParameters()) {
            e.accept(valueCGVisitor, null);
        }
        cg.call(functionInvocation.getVariable().getIdentifier(), true);
        Type returnType = ((FunctionType)functionInvocation.getVariable().getType()).getReturnType();
        if (!(returnType instanceof VoidType)) {
            cg.pop(returnType.suffix());
        }
        return null;
    }

    @Override
    public Void visit(Return ret, ReturnSizesDTO param) {
        cg.ret(param.returnBytes, param.localVarBytes, param.paramBytes);
        return null;
    }
}
