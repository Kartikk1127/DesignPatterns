/*
The code provided for the Singleton pattern is not thread-safe. If there are two
threads trying to access the getInstance() method at the same time, it is
possible for both threads to create separate instances of the Singleton class.
This violates the principle of the Singleton pattern, which is supposed to
ensure that only one instance of the class is created.
*/

/*To make the Singleton pattern thread-safe, you can modify the getInstance()
method to use synchronisation.*/

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            SingletonExample singletonExample = SingletonExample.getInstance();

            singletonExample.showMessage();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}