package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class IntLiteral extends AbstractASTNode implements Expression {

    private int value;

    public IntLiteral(int line, int row, int value) {
        super(line, row);
        this.value = value;
    }
}
