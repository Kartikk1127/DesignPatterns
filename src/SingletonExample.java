public class SingletonExample {
    private static SingletonExample singletonExample;

    //private constructor to prevent instantiation from other objects
    private SingletonExample(){

    }


    //this method is marked as synchronized 
    public static synchronized SingletonExample getInstance(){
        if (singletonExample==null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void showMessage(){
        System.out.println("Hello, I am singleton!");
    }

}
