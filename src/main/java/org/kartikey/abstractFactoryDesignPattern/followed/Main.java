package org.kartikey.abstractFactoryDesignPattern.followed;


import org.kartikey.abstractFactoryDesignPattern.followed.factory.VehicleAbstractFactory;
import org.kartikey.abstractFactoryDesignPattern.followed.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleAbstractFactory factory = new VehicleAbstractFactory();
        VehicleFactory vehicleFactory = factory.getVehicleFactory("ORDINARY");
        vehicleFactory.getVehicle().average();

    }
}
