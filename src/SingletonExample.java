public class SingletonExample {
    private static SingletonExample singletonExample;

    //private constructor to prevent instantiation from other objects
    private SingletonExample(){

    }

    public static SingletonExample getInstance(){
        if (singletonExample==null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void showMessage(){
        System.out.println("Hello, I am singleton!");
    }

}
