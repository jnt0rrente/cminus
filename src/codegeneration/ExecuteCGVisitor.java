package codegeneration;


import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.Assignment;
import ast.statement.Read;
import ast.statement.Write;
import ast.type.FunctionType;
import ast.type.VoidType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {
    AddressCGVisitor addressCGVisitor;
    ValueCGVisitor valueCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public ExecuteCGVisitor(AddressCGVisitor addressCGVisitor, ValueCGVisitor valueCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
        this.valueCGVisitor = valueCGVisitor;
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
