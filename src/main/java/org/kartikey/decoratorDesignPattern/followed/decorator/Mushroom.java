package org.kartikey.decoratorDesignPattern.followed.decorator;

import org.kartikey.decoratorDesignPattern.followed.BasePizza;

//has-a relationship
public class Mushroom extends ToppingDecorator{
    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost()+15;
    }
}
