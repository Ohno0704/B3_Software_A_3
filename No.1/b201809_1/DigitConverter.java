public class DigitConverter extends Converter {
    private final char replaceChar;
    public DigitConverter(char rc) {
        replaceChar = rc;
    }
    @Override
    protected String computeStringToAppend(char c) {
        if (Character.isDigit(c)) {
            return String.valueOf(replaceChar);
        }
        else {
            return String.valueOf(c);
        }
    }
}
