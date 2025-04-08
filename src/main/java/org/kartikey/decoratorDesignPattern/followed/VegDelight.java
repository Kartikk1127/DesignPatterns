package org.kartikey.decoratorDesignPattern.followed;

//is-a relationship
public class VegDelight extends BasePizza{
    @Override
    public int cost() {
        return 120;
    }
}
