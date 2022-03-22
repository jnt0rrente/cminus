package ast.definition;

import ast.AbstractASTNode;
import ast.Definition;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {
    private String name;
    private int scope;

    public AbstractDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }
}
