package com.beingadish.learning.WithStrategy.DriveStrategies;

public class SpecialStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Strategy");
    }
}
