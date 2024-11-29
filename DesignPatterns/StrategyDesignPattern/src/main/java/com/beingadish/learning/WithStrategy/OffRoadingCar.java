package com.beingadish.learning.WithStrategy;

import com.beingadish.learning.WithStrategy.DriveStrategies.SpecialStrategy;

/**
 * This Car also has the same capability as of with {@link SportsCar}
 */
public class OffRoadingCar extends Vehicle {


    public OffRoadingCar() {
        super(new SpecialStrategy());
    }
}
