package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import ast.definition.VariableDefinition;

import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {
    private List<VariableDefinition> variableDefinitions;
    private Type returnType;

    public FunctionType(int line, int column, Type type, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.variableDefinitions = variableDefinitions;
        this.returnType = type;
    }

    @Override
    public String toString() {
        return "Function: " + variableDefinitions.size() + " parameters, returns " + returnType;
    }
}
