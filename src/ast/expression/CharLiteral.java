package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class CharLiteral extends AbstractASTNode implements Expression {

    private char value;

    public CharLiteral(int line, int row, char value) {
        super(line, row);
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
