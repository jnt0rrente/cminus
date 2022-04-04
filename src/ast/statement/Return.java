package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

public class Return extends AbstractStatement implements Statement {
    private Expression returnValue;

    public Expression getReturnValue() {
        return returnValue;
    }

    public Return(int line, int column, Expression returnValue) {
        super(line, column);
        this.returnValue = returnValue;
    }

    @Override
    public String toString() {
        return "return " + returnValue;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
