package codegeneration;

import ast.definition.VariableDefinition;
import ast.expression.Variable;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void>{

    CodeGenerator cg = CodeGenerator.getInstance();

    @Override
    public Void visit(Variable variable, Void param) {
        if (variable.getDefinition().getScope() == 0) { //globals
            cg.writeTabbedInstruction("pusha " + ((VariableDefinition) variable.getDefinition()).getOffset());
        } else {
            cg.writeTabbedInstruction("push bp");
            cg.writeTabbedInstruction("pushi " + ((VariableDefinition) variable.getDefinition()).getOffset());
            cg.writeTabbedInstruction("addi");
        }
        return null;
    }
}
