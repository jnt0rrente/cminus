package ast.definition;

import ast.*;

public class VariableDefinition extends AbstractDefinition implements Expression, Definition {
    private Type type;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name);
        this.type = type;
    }
}
