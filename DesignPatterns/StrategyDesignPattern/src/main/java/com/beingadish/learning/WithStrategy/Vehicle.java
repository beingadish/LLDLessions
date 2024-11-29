package com.beingadish.learning.WithStrategy;

import com.beingadish.learning.WithStrategy.DriveStrategies.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    // Drive Method
    public void drive() {
        this.driveStrategy.drive();
    }
}
