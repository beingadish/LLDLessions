package com.beingadish.learning.WithStrategy.DriveStrategies;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Capability");
    }
}
