package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class CharLiteral extends AbstractExpression {

    private char value;

    public CharLiteral(int line, int row, char value) {
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
