package org.kartikey.factoryDesignPattern.followed;

//is-a relationship
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("square drawn");
    }
}
