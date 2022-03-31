package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractType {
    public CharType(int line, int column) {
        super(line, column);

    }

    @Override
    public String toString() {
        return "Char builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type castTo(Type type2) {
        if (type2 instanceof IntType) return new IntType(0,0);
        return super.castTo(type2);
    }

    @Override
    public String getTypeName() {
        return "CharType";
    }
}
