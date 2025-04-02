package org.kartikey.strategyDesignPattern.violated;

public class Main {
    public static void main(String[] args) {
        //here in the off road and sports vehicle class you'll see that they override the base class's drive method to implement their own logic
        //but the logic in both the classes remains the same. This is code duplication and it violates DRY principle.
        System.out.println("Hello world!");
    }
}