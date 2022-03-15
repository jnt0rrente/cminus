package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class FieldAccess extends AbstractExpression {
    private String name;
    private Expression exp;

    public FieldAccess(int line, int column, String name, Expression exp) {
        super(line,column);

        this.name = name;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp + "." + name;
    }
}
