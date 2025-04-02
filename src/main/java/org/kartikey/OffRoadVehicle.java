package org.kartikey;

import org.kartikey.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
