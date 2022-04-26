package codegeneration;

import ast.Type;
import ast.type.DoubleType;

import java.io.BufferedWriter;
import java.io.IOException;

public class CodeGenerator {

    private static CodeGenerator instance;
    private BufferedWriter bufferedWriter;
    private String programName;
    int labelNumberCounter = 0;

    private CodeGenerator() {
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

    public void writeTabbedInstruction(String instruction) {
        if (instruction.length() <= 0) return;
        rawWrite("\t" + instruction + "\n");
    }

    public void writeInstruction(String instruction) {
        if (instruction.length() <= 0) return;
        rawWrite(instruction + "\n");
    }

    public void comment(String comment) {
        rawWrite("\t' * " + comment + "\n");
    }

    public char minIntSuffix(Type type) {
        if (type instanceof DoubleType) return 'f';
        return 'i';
    }

    public void writeProgramName() {
        rawWrite("#source \"" + programName + "\"\n\n");
    }

    public void writeLine(int line) {
        rawWrite("\n#line " + line + "\n");
    }

    public void writeTabbedConvertInstruction(String instruction) {
        if (instruction.length() <= 0) return;
        String[] steps = instruction.split(",");
        for (String s : steps) {
            rawWrite("\t" + s + "\n");
        }
    }

    public String nextLabel() {
        labelNumberCounter++;
        return "label"+labelNumberCounter;
    }

    public void writeLabel(String label) {
        rawWrite(label + ":\n");
    }

    private void rawWrite(String toWrite) {
        try {
            System.out.print(toWrite);
            bufferedWriter.write(toWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
