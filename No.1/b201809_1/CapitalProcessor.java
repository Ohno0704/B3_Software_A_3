public class CapitalProcessor extends Processor {
    private char replaceChar; // DigitConveterにより置き換える文字
    
    public Converter build() { 
        if (this.replaceChar == Character.MIN_VALUE) {
            return new CapitalLower();
        }
        else {
            return new CapitalConverter(replaceChar);
        }
    }

    public void setReplaceChar(char rc) {
        this.replaceChar = rc;
    }
}
