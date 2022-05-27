package ast.expression;

import semantic.Visitor;

public class BooleanLiteral extends AbstractExpression {
    private boolean value;

    public BooleanLiteral(int line, int row, boolean value) {
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

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}
