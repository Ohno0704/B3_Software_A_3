public class CapitalConverter extends Converter {
    private final char replaceChar;
    public CapitalConverter(char rc) {
        replaceChar = rc;
    }
    @Override
    protected String computeStringToAppend(char c) {
        if (Character.isUpperCase(c)) {
            return String.valueOf(replaceChar);
        }
        else {
            return String.valueOf(c);
        }
    }
}
