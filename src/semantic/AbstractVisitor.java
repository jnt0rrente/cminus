package semantic;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program program, TP param) {
        program.getDefinitions().forEach(def -> def.accept(this,null));
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        functionDefinition.getBodyStatements().forEach(def -> def.accept(this,null));
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        variableDefinition.setLvalue(true);
        return null;
    }
}
