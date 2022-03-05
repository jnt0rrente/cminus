package ast.definition;

import ast.AbstractASTNode;
import ast.Definition;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {
    private String name;

    public AbstractDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
