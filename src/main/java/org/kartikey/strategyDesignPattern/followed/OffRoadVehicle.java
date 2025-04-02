package org.kartikey.strategyDesignPattern.followed;

import org.kartikey.strategyDesignPattern.followed.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
