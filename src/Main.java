/*
The code provided for the Singleton pattern is not thread-safe. If there are two
threads trying to access the getInstance() method at the same time, it is
possible for both threads to create separate instances of the Singleton class.
This violates the principle of the Singleton pattern, which is supposed to
ensure that only one instance of the class is created.
*/

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();

        singletonExample.showMessage();
    }
}