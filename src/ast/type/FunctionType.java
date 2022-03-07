package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import ast.definition.VariableDefinition;

import java.util.Arrays;
import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {
    private List<VariableDefinition> variableDefinitions;
    private Type type;

    public FunctionType(int line, int column, Type type, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.variableDefinitions = variableDefinitions;
        this.type = type;
    }

    @Override
    public String toString() {
        return "function type: " + variableDefinitions.size() + " parameters, returns " + type;
    }
}
