package ast;

public interface Expression extends ASTNode {
    public boolean getLvalue();
    public void setLvalue(boolean lvalue);

    Type getType();

    void setType(Type type);
}
