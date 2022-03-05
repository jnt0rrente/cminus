package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import ast.definition.VariableDefinition;

public class FunctionType extends AbstractASTNode implements Type {
    private VariableDefinition[] variableDefinitions;
    private Type type;

    public FunctionType(int line, int column, Type type, VariableDefinition...variableDefinitions) {
        super(line, column);
        this.variableDefinitions = variableDefinitions;
        this.type = type;
    }
}
