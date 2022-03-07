package ast;

import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions;
    private Definition main; //best approach i got

    public Program(int line, int column, List<Definition> definitions, Definition main) {
        super(line, column);
        this.definitions = definitions;
        this.main = main;
    }

    @Override
    public String toString() {
        return "Program: " + definitions.size() + " definitions.";
    }
}
