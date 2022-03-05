package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class Read extends AbstractASTNode implements Statement {
    private List<Expression> readVal;

    public Read(int line, int column, List<Expression> readVal) {
        super(line, column);
        this.readVal = readVal;
    }

    @Override
    public String toString() {
        return "read " + readVal.size() + " values";
    }
}
