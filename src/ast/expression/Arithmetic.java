package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class Arithmetic extends AbstractASTNode implements Expression {
    private char operator;
    private Expression operand1;
    private Expression operand2;

    public Arithmetic(int line, int column, char operator, Expression operand1, Expression operand2) {
        super(line, column);

        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

}
