package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class Arithmetic extends AbstractExpression {
    private char operator;
    private Expression operand1;
    private Expression operand2;

    public Arithmetic(int line, int column, char operator, Expression operand1, Expression operand2) {
        super(line, column);

        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Expression getOperand1() {
        return operand1;
    }

    public Expression getOperand2() {
        return operand2;
    }

    @Override
    public String toString() {
        return (operand1 + " " + operator + " " + operand2);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
