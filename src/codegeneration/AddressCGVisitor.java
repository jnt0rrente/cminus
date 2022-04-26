package codegeneration;

import ast.definition.VariableDefinition;
import ast.expression.FieldAccess;
import ast.expression.Indexing;
import ast.expression.IntLiteral;
import ast.expression.Variable;

/**
 * address[[Indexing: expression1 -> expression2 expression3]] =
 *     address[[expression2]]
 *     <pushi> expression1.type.numberOfBytes()
 *     value[[expression3]]
 *     <muli>
 *     <addi>
 *
 * address[[FieldAccess: expression1 -> expression2 ID]] =
 *     address[[expression2]]
 *     expression2.getRecord(ID).offset
 *     <addi>
*/
public class AddressCGVisitor extends AbstractCGVisitor<Void, Void>{
    ValueCGVisitor valueCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getArray().accept(this, param);
        cg.writeTabbedInstruction("pushi " + indexing.getType().numberOfBytes());
        indexing.getIndex().accept(valueCGVisitor, param);
        cg.writeTabbedInstruction("muli");
        cg.writeTabbedInstruction("addi");
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this, param);
        cg.writeTabbedInstruction("pushi " + fieldAccess.getSpecificRecord().getOffset());
        cg.writeTabbedInstruction("addi");
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        if (variable.getDefinition().getScope() == 0) { //globals
            cg.writeTabbedInstruction("pusha " + ((VariableDefinition) variable.getDefinition()).getOffset());
        } else {
            cg.writeTabbedInstruction("push bp");
            cg.writeTabbedInstruction("pushi " + ((VariableDefinition) variable.getDefinition()).getOffset());
            cg.writeTabbedInstruction("addi");
        }
        return null;
    }
}
