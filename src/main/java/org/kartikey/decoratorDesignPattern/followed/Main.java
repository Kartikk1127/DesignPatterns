package org.kartikey.decoratorDesignPattern.followed;

import org.kartikey.decoratorDesignPattern.followed.decorator.ExtraCheese;
import org.kartikey.decoratorDesignPattern.followed.decorator.Mushroom;

public class Main {
    public static void main(String [] args){
        //let's say we want margherita with extra cheese

        BasePizza margheritaWithExtraCheese = new ExtraCheese(new Margherita());
        System.out.println(margheritaWithExtraCheese.cost());

        //let's say we also want to add mushroom to this
        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println(margheritaWithExtraCheeseAndMushroom.cost());

        //like this we can go on to layer infinite number of decorators
    }
}
