package com.beingadish.learning.WithStrategy;

import com.beingadish.learning.WithStrategy.DriveStrategies.SubSpecialStrategy;

public class SUV extends Vehicle {
    SUV() {
        super(new SubSpecialStrategy());
    }
}
