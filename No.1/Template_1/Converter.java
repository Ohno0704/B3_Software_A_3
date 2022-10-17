public abstract class Converter {
    public String convert(String source) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<source.length(); i++) {
            String str = computeStringToAppend(source.charAt(i));
            if (str != null) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
    protected abstract String computeStringToAppend(char c);
}