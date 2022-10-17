public class CapitalLower extends Converter {
    @Override
    protected String computeStringToAppend(char c) {
        return String.valueOf(Character.toLowerCase(c));
    }
}