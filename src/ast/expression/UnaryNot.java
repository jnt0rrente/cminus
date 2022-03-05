package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class UnaryNot extends AbstractASTNode implements Expression {
    Expression target;

    public UnaryNot(int row, int column, Expression exp) {
        super(row,column);
        this.target = exp;
    }
}
