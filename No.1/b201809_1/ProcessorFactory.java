
public class ProcessorFactory {
    // singletonオブジェクトの生成
    private static final ProcessorFactory processFactoryInstance = new ProcessorFactory();

    // アクセス不許可のコンストラクタ
    private ProcessorFactory() {}

    // インスタンス取得用メソッド
    public static ProcessorFactory getInstance() {
        return processFactoryInstance;
    }

    // 各種クラスの生成メソッド
    public Processor create(String conversionType, char replaceCharacter) {
        if (conversionType.equals("Digit")) {
            DigitProcessor digitProcessor = new DigitProcessor();
            digitProcessor.setReplaceChar(replaceCharacter);
            return digitProcessor;
        } 
        else if (conversionType.equals("Capital")) {
            CapitalProcessor capitalProcessor = new CapitalProcessor();
            capitalProcessor.setReplaceChar(replaceCharacter);
            return capitalProcessor;
        }
        else {
            return null;
        }
    }
}
