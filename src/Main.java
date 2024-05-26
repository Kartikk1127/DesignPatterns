/*
The code provided for the Singleton pattern is not thread-safe. If there are two
threads trying to access the getInstance() method at the same time, it is
possible for both threads to create separate instances of the Singleton class.
This violates the principle of the Singleton pattern, which is supposed to
ensure that only one instance of the class is created.
*/

/*To make the Singleton pattern thread-safe, you can modify the getInstance()
method to use synchronisation.*/

// to make the lazy initialization thread safe you can use double checked locking or use the synchronized keyword in the getInstance() method, but these approaches have their own set of complexities and performance considerations
public class Main {
    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        singleton.showMessage();
    }
}