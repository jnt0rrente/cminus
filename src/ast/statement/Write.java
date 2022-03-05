package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class Write extends AbstractASTNode implements Statement {
    private List<Expression> writeVal;

    public Write(int line, int column, List<Expression> writeVal) {
        super(line, column);
        this.writeVal = writeVal;
    }
}
