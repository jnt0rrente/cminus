package codegeneration;

import ast.Type;
import ast.type.DoubleType;

import java.io.BufferedWriter;
import java.io.IOException;

public class CodeGenerator implements MaplSpecificationHandler {

    private static CodeGenerator instance;
    private BufferedWriter bufferedWriter;
    private String programName;

    int labelNumberCounter = 0;

    private CodeGenerator() {
    }

    public char minIntSuffix(Type type) {
        if (type instanceof DoubleType) return 'f';
        return 'i';
    }

    public String nextLabel() {
        labelNumberCounter++;
        return "label" + labelNumberCounter;
    }

    public void setParams(BufferedWriter bufferedWriter, String programName) {
        this.bufferedWriter = bufferedWriter;
        this.programName = programName;
    }

    public static CodeGenerator getInstance() {
        if (instance == null) {
            instance = new CodeGenerator();
        }
        return instance;
    }

    public void writeProgramName() {
        rawWrite(String.format("#source \"%s\"", programName));
    }

    private void writeLine(String line) {
        rawWrite(line + "\n");
    }

    private void writeIndentedLine(String line) {
        writeLine("\t" + line);
    }

    private void rawWrite(String toWrite) {
        try {
            System.out.print(toWrite);
            bufferedWriter.write(toWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void shortComment(String comment) {
        writeLine("\t' " + comment);
    }

    @Override
    public void longComment(String comment) {
        writeLine("\t' * " + comment);
    }

    @Override
    public void label(String label) {
        writeLine(label + ":");
    }

    @Override
    public void tag(String tagName, String tagBody) {
        writeLine("#" + tagName + "\t" + tagBody);
    }

    @Override
    public void line(int line) {
        writeLine("\n#line " + line);
    }

    @Override
    public void call(String calledFunction, boolean indent) {
        writeLine((indent ? "\t" : "") + "call " + calledFunction);
    }

    @Override
    public void halt() {
        writeLine("halt");
    }

    @Override
    public void and() {
        writeIndentedLine("and");
    }

    @Override
    public void or() {
        writeIndentedLine("or");
    }

    @Override
    public void not() {
        writeIndentedLine("not");
    }

    @Override
    public void b2i() {
        writeIndentedLine("b2i");
    }

    @Override
    public void i2f() {
        writeIndentedLine("i2f");
    }

    @Override
    public void f2i() {
        writeIndentedLine("f2i");
    }

    @Override
    public void i2b() {
        writeIndentedLine("i2b");
    }

    @Override
    public void enter(int allocate) {
        writeIndentedLine("enter " + allocate);
    }

    @Override
    public void ret(int returnBytes, int localVariablesSize, int argumentsSize) {
        writeIndentedLine(String.format("ret %d, %d, %d", returnBytes, localVariablesSize, argumentsSize));
    }

    @Override
    public void jmp(String label) {
        writeIndentedLine("jmp " + label);
    }

    @Override
    public void jz(String label) {
        writeIndentedLine("jz " + label);
    }

    @Override
    public void jnz(String label) {
        writeIndentedLine("jnz " + label);
    }

    @Override
    public void push(char suffix, String param) {
        writeIndentedLine("push" + suffix + " " + param);
    }

    @Override
    public void pop(char suffix) {
        writeIndentedLine("pop" + suffix);
    }

    @Override
    public void dup(char suffix) {
        writeIndentedLine("dup" + suffix);
    }

    @Override
    public void load(char suffix) {
        writeIndentedLine("load" + suffix);
    }

    @Override
    public void store(char suffix) {
        writeIndentedLine("store" + suffix);
    }

    @Override
    public void add(char suffix) {
        writeIndentedLine("add" + suffix);
    }

    @Override
    public void sub(char suffix) {
        writeIndentedLine("sub" + suffix);
    }

    @Override
    public void mul(char suffix) {
        writeIndentedLine("mul" + suffix);
    }

    @Override
    public void div(char suffix) {
        writeIndentedLine("div" + suffix);
    }

    @Override
    public void mod(char suffix) {
        writeIndentedLine("mod" + suffix);
    }

    @Override
    public void gt(char suffix) {
        writeIndentedLine("gt" + suffix);
    }

    @Override
    public void lt(char suffix) {
        writeIndentedLine("lt" + suffix);
    }

    @Override
    public void ge(char suffix) {
        writeIndentedLine("ge" + suffix);
    }

    @Override
    public void le(char suffix) {
        writeIndentedLine("le" + suffix);
    }

    @Override
    public void eq(char suffix) {
        writeIndentedLine("eq" + suffix);
    }

    @Override
    public void ne(char suffix) {
        writeIndentedLine("ne" + suffix);
    }

    @Override
    public void out(char suffix) {
        writeIndentedLine("out" + suffix);
    }

    @Override
    public void in(char suffix) {
        writeIndentedLine("in" + suffix);
    }

    public void convert(String instruction) {
        if (instruction.length() <= 0) return;
        String[] steps = instruction.split(",");
        for (String s : steps) {
            writeIndentedLine(s + "\n");
        }
    }
}
