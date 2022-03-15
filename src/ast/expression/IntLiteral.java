package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class IntLiteral extends AbstractExpression {

    private int value;

    public IntLiteral(int line, int row, int value) {
        super(line, row);
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
