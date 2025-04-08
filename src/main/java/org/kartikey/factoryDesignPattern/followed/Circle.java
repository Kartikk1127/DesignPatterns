package org.kartikey.factoryDesignPattern.followed;

//is-a relationship
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}
