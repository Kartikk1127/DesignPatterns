
/*In this implementation, the getInstance() method first checks if the instance is null .
If it is, it enters a synchronized block to prevent multiple threads from entering this
block simultaneously. Inside the synchronized block, it checks again if the
instance is null (double checking). If it is still null , it creates a new instance of
the Singleton class.
The volatile keyword ensures that changes to the instance variable are visible to
all threads, preventing any thread from seeing a partially initialized instance.
While double locking can provide lazy initialization and thread safety, it has some
drawbacks, such as potential performance issues due to the synchronization
overhead and the complexity it adds to the code.*/
public class DoubleLockingSingleton {
    public static volatile DoubleLockingSingleton instance;

    private DoubleLockingSingleton(){

    }

    public static DoubleLockingSingleton getInstance(){
        if (instance==null){
            synchronized (DoubleLockingSingleton.class){
                if (instance==null){
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello I am double locking method to ensure thread safety in lazy initialization");
    }
}
