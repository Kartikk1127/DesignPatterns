package org.kartikey.abstractFactoryDesignPattern.followed.factory;

import org.kartikey.abstractFactoryDesignPattern.followed.*;

public class LuxuryFactory implements VehicleFactory {
    /*Vehicle getVehicle(String input){
        return switch (input){
            case "BMW" -> new LuxuryV1();
            case "MERCEDES" -> new LuxuryV2();
            default -> null;
        };
    }*/

    @Override
    public Vehicle getVehicle() {
        return new LuxuryV1();
    }
}
