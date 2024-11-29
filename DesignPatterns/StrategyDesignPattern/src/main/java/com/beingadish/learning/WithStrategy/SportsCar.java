package com.beingadish.learning.WithStrategy;

import com.beingadish.learning.WithStrategy.DriveStrategies.SpecialStrategy;

public class SportsCar extends Vehicle {
    public SportsCar() {
        super(new SpecialStrategy());
    }
}
