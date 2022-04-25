package ast;

public interface Expression extends ASTNode {
    boolean getLvalue();
    void setLvalue(boolean lvalue);

    Type getType();

    void setType(Type type);
}
