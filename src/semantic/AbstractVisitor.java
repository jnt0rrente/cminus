package semantic;

import ast.Program;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program program, TP param) {
        program.getDefinitions().forEach(def -> def.accept(this,null));

        return null;
    }
}
