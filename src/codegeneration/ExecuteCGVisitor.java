package codegeneration;


import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * execute[[While: statement -> expression statement*]] =
 *     String conditionLabel = cg.nextLabel(),
 *     exitLabel = cg.nextLabel();
 *     conditionLabel <:>
 *     value[[expression]]
 *     <jz > exitLabel
 *     statement*.forEach(st -> execute[[st]]);
 *     <jmp > conditionLabel
 *     exitLabel <:>
 *
 * execute[[IfElse: statement -> expression statement1* statement2*]] =
 *     String exitLabel = cg.nextLabel();
 *     String elseLabel = cg.nextLabel();
 *     value[[expression]]
 *     <jz > elseLabel
 *     statement1*.forEach(st -> execute[[st]]);
 *     <jmp > exitLabel
 *     elseLabel <:>
 *     statement2*.forEach(st -> execute[[st]]);
 *     exitLabel <:>
 *
 */
public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {
    AddressCGVisitor addressCGVisitor;
    ValueCGVisitor valueCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public ExecuteCGVisitor(AddressCGVisitor addressCGVisitor, ValueCGVisitor valueCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(WhileLoop whileLoop, Void param) {
        cg.comment("While Loop");
        String conditionLabel = cg.nextLabel();
        String exitLabel = cg.nextLabel();

        cg.writeLabel(conditionLabel);
        whileLoop.getCondition().accept(valueCGVisitor, param);
        cg.writeTabbedInstruction("jz " + exitLabel);

        whileLoop.getBody().forEach(statement -> statement.accept(this, param));
        cg.writeTabbedInstruction("jmp " + conditionLabel);

        cg.writeLabel(exitLabel);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        String exitLabel = cg.nextLabel();
        String elseLabel = cg.nextLabel();
        cg.comment("If/Else");

        ifElse.getCondition().accept(valueCGVisitor, param);

        cg.writeTabbedInstruction("jz " + elseLabel);

        cg.comment("If Body");
        ifElse.getBody().forEach(statement -> statement.accept(this, param));

        cg.writeTabbedInstruction("jmp " + exitLabel);

        cg.comment("Else Body");
        cg.writeLabel(elseLabel);
        ifElse.getBodyElse().forEach(statement -> statement.accept(this, param));

        cg.writeLabel(exitLabel);
        return null;
    }

    @Override
    public Void visit(Program program, Void param) {
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
        cg.comment("Calling the main function.");
        cg.writeInstruction("call main");
        cg.writeInstruction("halt");
        for (Definition def : functionDefs) {
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLHS().accept(addressCGVisitor, param);
        assignment.getRHS().accept(valueCGVisitor, param);
        cg.writeTabbedInstruction("store" + assignment.getLHS().getType().suffix());
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        cg.writeLine(functionDefinition.getLine());
        cg.writeInstruction(functionDefinition.getName() + ":");
        cg.comment("Parameters:");
        ((FunctionType) functionDefinition.getType()).getParameterVariableDefinitions().forEach(paramDef -> paramDef.accept(this, param));
        cg.comment("Local variables:");
        functionDefinition.getBodyVariableDefinitions().forEach(paramDef -> paramDef.accept(this, param));
        cg.writeTabbedInstruction("enter " + functionDefinition
                .getBodyVariableDefinitions()
                .get(functionDefinition.getBodyVariableDefinitions().size() - 1)
                .getOffset() * -1); //offset of last variable definition
        for (Statement statement : functionDefinition.getBodyStatements()) {
            cg.writeLine(statement.getLine());
            statement.accept(this, param);
        }

        if (((FunctionType) functionDefinition.getType()).getReturnType() instanceof VoidType) {
            int variablesSize = functionDefinition.getBodyVariableDefinitions()
                    .stream().mapToInt(varDef -> varDef.getType().numberOfBytes()).sum();

            int parametersSize = ((FunctionType) functionDefinition.getType()).getParameterVariableDefinitions()
                    .stream().mapToInt(paramDef -> paramDef.getType().numberOfBytes()).sum();
            cg.writeTabbedInstruction(String.format("ret %d, %d, %d", 0, variablesSize, parametersSize));
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        cg.comment(variableDefinition.getType().getTypeName() + " " + variableDefinition.getName() + " (offset " + variableDefinition.getOffset() + ")");
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        cg.comment("Read");
        read.getReadVal().accept(addressCGVisitor, param);
        cg.writeTabbedInstruction("in" + read.getReadVal().getType().suffix());
        cg.writeTabbedInstruction("store" + read.getReadVal().getType().suffix());
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        cg.comment("Write");
        write.getWriteVal().accept(valueCGVisitor, param);
        cg.writeTabbedInstruction("out" + write.getWriteVal().getType().suffix());
        return null;
    }
}
