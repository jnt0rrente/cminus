package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.List;

public class Write extends AbstractASTNode implements Statement {
    private Expression writeVal;

    public Write(int line, int column, Expression writeVal) {
        super(line, column);
        this.writeVal = writeVal;
    }

    @Override
    public String toString() {
        return "write " + writeVal;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
