package org.kartikey.strategyDesignPattern.followed;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();

        Vehicle sportsVehicle = new OffRoadVehicle();
        sportsVehicle.drive();
    }
}