package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class Logical extends AbstractASTNode implements Expression {
    private String operator;
    private Expression operand1;
    private Expression operand2;

    public Logical(int row, int column, String operator, Expression operand1, Expression operand2) {
        super(row, column);

        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

}
