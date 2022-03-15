package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLvalue() {
        return lvalue;
    }

    @Override
    public void setLvalue(boolean lvalue) {
        this.lvalue = lvalue;
    }
}
