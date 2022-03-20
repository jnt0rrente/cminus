package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
