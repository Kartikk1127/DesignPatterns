package org.kartikey.decoratorDesignPattern.followed;

//is-a relationship
public class Farmhouse extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
