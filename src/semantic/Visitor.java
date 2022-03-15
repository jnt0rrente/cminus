package semantic;

import ast.Program;
import ast.expression.Variable;
import ast.statement.Assignment;

public interface Visitor<TP, TR> {
    TR visit(Program program, TP param);

    TR visit(Assignment program, TP param);

    TR visit(Variable program, TP param);
}

