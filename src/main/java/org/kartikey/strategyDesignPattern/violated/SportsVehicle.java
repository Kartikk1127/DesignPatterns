package org.kartikey.strategyDesignPattern.violated;

public class SportsVehicle extends Vehicle{

    @Override
    public void drive(){
        //different drive logic
        System.out.println("Sports drive capability");
    }
}
