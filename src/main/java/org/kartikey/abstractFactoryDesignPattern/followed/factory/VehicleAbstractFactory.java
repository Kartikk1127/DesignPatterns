package org.kartikey.abstractFactoryDesignPattern.followed.factory;

//has-a relationship
public class VehicleAbstractFactory {
    public VehicleFactory getVehicleFactory(String input){
        return switch (input){
            case "LUXURY" -> new LuxuryFactory();
            case "ORDINARY" -> new OrdinaryFactory();
            default -> null;
        };
    }
}
