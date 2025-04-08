package org.kartikey.factoryDesignPattern.followed;

import org.kartikey.factoryDesignPattern.followed.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
