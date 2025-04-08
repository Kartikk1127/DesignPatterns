package org.kartikey.factoryDesignPattern.followed;

//is-a relationship
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("rectangle drawn");
    }
}
