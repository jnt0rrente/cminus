package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
