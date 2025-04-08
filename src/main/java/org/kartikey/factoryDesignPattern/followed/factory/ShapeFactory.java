package org.kartikey.factoryDesignPattern.followed.factory;

import org.kartikey.factoryDesignPattern.followed.Circle;
import org.kartikey.factoryDesignPattern.followed.Rectangle;
import org.kartikey.factoryDesignPattern.followed.Shape;
import org.kartikey.factoryDesignPattern.followed.Square;

//has-a relationship
public class ShapeFactory {

    public Shape getShape(String shape){
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
