public class DigitProcessor extends Processor {
    private char replaceChar; // DigitConveterにより置き換える文字

    public Converter build() { 
        if (this.replaceChar == Character.MIN_VALUE) {
            return new DigitRemover();
        }
        else {
            return new DigitConverter(replaceChar);
        }
    }

    public void setReplaceChar(char rc) {
        this.replaceChar = rc;
    }
}
