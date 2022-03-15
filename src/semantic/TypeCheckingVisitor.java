package semantic;

import ast.expression.Variable;
import ast.statement.Assignment;

import javax.lang.model.type.ErrorType;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLHS().accept(this, null);
        assignment.getRHS().accept(this, null);

        if (!assignment.getLHS().getLvalue()) {
            new ErrorType("[" + assignment.getLHS().getLine() + ", " + assignment.getLHS().getColumn() + "]: L-value required");
        }
        return null;
    }


}
