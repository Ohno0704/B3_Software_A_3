public class DigitRemover extends Converter {
    @Override
    protected String computeStringToAppend(char c) {
        if (Character.isDigit(c) == false) {
            return String.valueOf (c);
        }
        else {
            return null;
        }
    }
}