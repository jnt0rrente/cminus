package ast;

import semantic.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions, Definition main) {
        super(line, column);
        this.definitions = definitions;
        this.definitions.add(main);
    }

    @Override
    public String toString() {
        return "Program: " + definitions.size() + " definitions.";
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
