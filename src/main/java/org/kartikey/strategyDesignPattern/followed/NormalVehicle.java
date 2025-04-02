package org.kartikey.strategyDesignPattern.followed;

import org.kartikey.strategyDesignPattern.followed.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
