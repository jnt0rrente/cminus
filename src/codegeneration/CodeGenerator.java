package codegeneration;

import ast.Type;
import ast.type.DoubleType;

import java.io.BufferedWriter;
import java.io.IOException;

public class CodeGenerator {

    private static CodeGenerator instance;
    private BufferedWriter bufferedWriter;
    private String programName;

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
        System.out.println(instruction);
        try {
            bufferedWriter.write("\t" + instruction + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeInstruction(String instruction) {
        if (instruction.length() <= 0) return;
        System.out.println(instruction);
        try {
            bufferedWriter.write(instruction + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void comment(String comment) {
        try {
            bufferedWriter.write("\t' * " + comment + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public char minIntSuffix(Type type) {
        if (type instanceof DoubleType) return 'f';
        return 'i';
    }

    public void writeProgramName() {
        try {
            bufferedWriter.write("#source \"" + programName + "\"\n\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeLine(int line) {
        try {
            bufferedWriter.write("\n#line " + line + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeTabbedConvertInstruction(String instruction) {
        if (instruction.length() <= 0) return;
        String[] steps = instruction.split(",");
        try {
            for (String s:
                 steps) {
                bufferedWriter.write("\t" + s + "\n");
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
