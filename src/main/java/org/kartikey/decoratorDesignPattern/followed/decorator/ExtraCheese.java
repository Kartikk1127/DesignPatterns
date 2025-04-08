package org.kartikey.decoratorDesignPattern.followed.decorator;

import org.kartikey.decoratorDesignPattern.followed.BasePizza;

//has-a relationship
public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;


    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
