/*
In this implementation, the LazySingleton class has a private constructor to prevent
external instantiation. The SingletonHelper class is a static inner class that holds the
        singleton instance. The getInstance() method of LazySingleton returns the instance
        from SingletonHelper , ensuring lazy initialization and thread safety due to the static
initialization of SingletonHelper .
This approach guarantees thread safety because the JVM handles the
initialization of the INSTANCE field of SingletonHelper in a thread-safe manner when
the class is loaded, and the inner class is loaded only when getInstance() is called.
*/


public class LazySingletonUsingStaticInnerClass {
    private LazySingletonUsingStaticInnerClass(){

    }

    private static class SingletonHelper{
        private static final LazySingletonUsingStaticInnerClass INSTANCE= new LazySingletonUsingStaticInnerClass();
    }

    public static LazySingletonUsingStaticInnerClass getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello I am lazily initialized using static inner class");
    }
}
