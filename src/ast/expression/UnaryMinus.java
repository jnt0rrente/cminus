package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class UnaryMinus extends AbstractExpression {

    private Expression target;

    public UnaryMinus(int line, int column, Expression target) {
        super(line, column);

        this.target = target;
    }

    public Expression getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return ("!" + target);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
