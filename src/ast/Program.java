package ast;

public class Program extends AbstractASTNode {
    private Definition[] definitions;

    public Program(int line, int column, Definition...definitions) {
        super(line, column);
        this.definitions = definitions;
    }
}
