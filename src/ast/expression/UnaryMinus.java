package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class UnaryMinus extends AbstractASTNode implements Expression {

    private Expression target;

    public UnaryMinus(int line, int column, Expression target) {
        super(line, column);

        this.target = target;
    }
}
