package codegeneration;

import ast.definition.VariableDefinition;
import ast.expression.FieldAccess;
import ast.expression.Indexing;
import ast.expression.Variable;

/**
 * address[[Indexing: expression1 -> expression2 expression3]] =
 * address[[expression2]]
 * <pushi> expression1.type.numberOfBytes()
 * value[[expression3]]
 * <muli>
 * <addi>
 * <p>
 * address[[FieldAccess: expression1 -> expression2 ID]] =
 * address[[expression2]]
 * expression2.getRecord(ID).offset
 * <addi>
 */
public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    ValueCGVisitor valueCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getArray().accept(this, param);
        cg.push('i', "" + indexing.getType().numberOfBytes());
        indexing.getIndex().accept(valueCGVisitor, param);
        cg.mul('i');
        cg.add('i');
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this, param);
        cg.shortComment("Accessing RecordField " + fieldAccess.getName());
        cg.push('i', "" + fieldAccess.getSpecificRecord().getOffset());
        cg.add('i');
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        if (variable.getDefinition().getScope() == 0) { //globals
            cg.push('i', "" + ((VariableDefinition) variable.getDefinition()).getOffset());
        } else {
            cg.push('i', "bp");
            cg.push('i', ""+((VariableDefinition) variable.getDefinition()).getOffset());
            cg.add('i');
        }
        return null;
    }
}
