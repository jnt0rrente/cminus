package ast;

public interface Statement extends ASTNode {
    void setReturnType(Type type);

    Type getReturnType();
}
