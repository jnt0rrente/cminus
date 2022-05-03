package codegeneration;

public class ReturnSizesDTO {
    public int returnBytes;
    public int localVarBytes;
    public int paramBytes;

    public ReturnSizesDTO(int returnBytes, int localVarBytes, int paramBytes) {
        this.returnBytes = returnBytes;
        this.localVarBytes = localVarBytes;
        this.paramBytes = paramBytes;
    }
}
