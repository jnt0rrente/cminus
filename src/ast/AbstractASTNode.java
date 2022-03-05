package ast;

public abstract class AbstractASTNode implements ASTNode {
    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public AbstractASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }
}
