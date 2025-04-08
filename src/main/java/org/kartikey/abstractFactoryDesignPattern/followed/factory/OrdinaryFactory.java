package org.kartikey.abstractFactoryDesignPattern.followed.factory;

import org.kartikey.abstractFactoryDesignPattern.followed.OrdinaryV1;
import org.kartikey.abstractFactoryDesignPattern.followed.Vehicle;

public class OrdinaryFactory implements VehicleFactory {
    /*Vehicle getVehicle(String input){
        return switch (input){
            case "TATA" -> new OrdinaryV1();
            case "HYUNDAI" -> new OrdinaryV2();
            default -> null;
        };
    }*/

    @Override
    public Vehicle getVehicle() {
        return new OrdinaryV1();
    }
}
