package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class UnaryNot extends AbstractExpression {
    Expression target;

    public UnaryNot(int row, int column, Expression exp) {
        super(row,column);
        this.target = exp;
    }

    @Override
    public String toString() {
        return ("-" + target);
    }
}
