package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class UnaryMinus extends AbstractExpression {

    private Expression target;

    public UnaryMinus(int line, int column, Expression target) {
        super(line, column);

        this.target = target;
    }

    @Override
    public String toString() {
        return ("!" + target);
    }
}
