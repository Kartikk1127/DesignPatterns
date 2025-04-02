package org.kartikey;

import org.kartikey.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
