package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class RealLiteral extends AbstractExpression {

    private double value;

    public RealLiteral(int line, int row, double value) {
        super(line, row);
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}