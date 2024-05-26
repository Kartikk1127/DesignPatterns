//since the instance is created statically the implementation is straightforward
// it is thread safe as the instance is created when the class is loaded ensuring only one instance is created
public class EarlySingleton {
    private static final EarlySingleton instance = new EarlySingleton();

    //private constructor to prevent instantiation
    private EarlySingleton(){

    }

    public static EarlySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, I am early initialized");
    }
}
