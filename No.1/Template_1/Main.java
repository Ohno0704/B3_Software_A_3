public class Main {
    public static void main(String[] args) {
        if (args.length <= 1 || args.length > 3) {
            System.err.println ("Input string, number of conversion (0〜3), replaced char");
            return;
        }
        int type = Integer.parseInt(args[1]);
        if (type < 0 || type > 1) {
            System.err.println ("Illegal number of conversion < 0 or > 1");
            return;
        }

        // from here, replace with the adequate codes using new classes designed with Builder and Factory patterns
        Converter converter = null;
        if (type == 0) {
            if (args.length == 2)
                converter = new DigitRemover();
            else
                converter = new DigitConverter(args[2].charAt(0));
        }
        else { // type == 1
            if (args.length == 2)
                converter = new CapitalLower();
            else
                converter = new CapitalConverter(args[2].charAt(0));
        }

        if (converter != null)
            System.out.println(converter.convert(args[0]));
    }
}