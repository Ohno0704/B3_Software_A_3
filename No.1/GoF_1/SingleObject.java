
public class SingleObject {
    // create a single instance of SingleObject
    private static final SingleObject instance = new SingleObject();

    // prohibit to access a constructor
    private SingleObject() {}

    // public method for getting an instance
    public static SingleObject newInstance() {
        return instance;
    }

    public static void main(String argv[]) {
        SingleObject single_obj = SingleObject.newInstance();
//        SingleObject single_o = new SingleObject();
    }
}
