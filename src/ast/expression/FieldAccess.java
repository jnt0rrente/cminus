package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class FieldAccess extends AbstractExpression {
    private String name;
    private Expression exp;

    public FieldAccess(int line, int column, String name, Expression exp) {
        super(line,column);

        this.name = name;
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return exp + "." + name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
