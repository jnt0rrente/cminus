package codegeneration;

public interface MaplSpecificationHandler {

    /**
     * ' comment
     */
    void shortComment(String comment);

    /**
     * ' * comment
     */
    void longComment(String comment);

    /**
     * label:
     */
    void label(String label);

    /**
     * #tagName tagBody
     */
    void tag(String tagName, String tagBody);

    /**
     * #line number
     */
    void line(int number);

    /**
     * (indent ? "\t" : "" ) + "call" + calledFunction
     */
    void call(String calledFunction, boolean indent);

    void enter(int allocate);

    void ret(int returnBytes, int localVariablesSize, int argumentsSize);

    void halt();

    void push(char suffix, String param);

    void pop(char suffix);

    void dup(char suffix);

    void load(char suffix);

    void store(char suffix);

    void add(char suffix);

    void sub(char suffix);

    void mul(char suffix);

    void div(char suffix);

    void mod(char suffix);

    void gt(char suffix);

    void lt(char suffix);

    void ge(char suffix);

    void le(char suffix);

    void eq(char suffix);

    void ne(char suffix);

    void out(char suffix);

    void in(char suffix);

    void b2i();

    void i2f();

    void f2i();

    void i2b();

    void and();

    void or();

    void not();

    void jmp(String label);

    void jz(String label);

    void jnz(String label);

}
