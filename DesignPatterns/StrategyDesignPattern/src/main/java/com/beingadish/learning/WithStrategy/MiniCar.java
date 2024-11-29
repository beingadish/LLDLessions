package com.beingadish.learning.WithStrategy;

import com.beingadish.learning.WithStrategy.DriveStrategies.NormalDriveStrategy;

public class MiniCar extends Vehicle {
    MiniCar() {
        super(new NormalDriveStrategy());
    }
}
