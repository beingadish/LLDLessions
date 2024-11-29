package com.beingadish.learning;

import com.beingadish.learning.WithoutStrategy.OffRoadingCar;
import com.beingadish.learning.WithoutStrategy.SportsCar;

public class Main {
    public static void main(String[] args) {

        // Below Code Demonstrates the same behaviour being shown by children at same levels
        // also this is against the principles, hence we try to remove it
        com.beingadish.learning.WithoutStrategy.Vehicle sportsCarVehicle = new SportsCar();
        com.beingadish.learning.WithoutStrategy.Vehicle offRoadingCarVehicle = new OffRoadingCar();
        sportsCarVehicle.drive();
        /**
         * Output same as -> {@linkplain sportsCarVehicle.drive()} Method used above
         * But the Code is duplicated and written twice at {@link SportsCar} and {@link OffRoadingCar}
         * */
        offRoadingCarVehicle.drive();

        System.out.println("================================ Using Strategy Design Pattern ================================");
        // Below using the Vehicles of Strategy Design Pattern
        /*
         * The fundamental of every design pattern is to separate out what changes over period of time from
         * what remains constant. As you see in Strategy pattern, we are trying to separate out dependency of drive
         * from the main class  as much as possible by making various strategies to inject it dynamically based on
         * client requirement so that in future if new requirement for drive comes, there will be minimal/no changes
         * in existing code(Open closed Principle).
         *
         * */

        com.beingadish.learning.WithStrategy.Vehicle sportsCarVehicleWithStrategy = new com.beingadish.learning.WithStrategy.SportsCar();
        com.beingadish.learning.WithStrategy.Vehicle offRoadingCarVehicleWithStrategy = new com.beingadish.learning.WithStrategy.OffRoadingCar();

        sportsCarVehicleWithStrategy.drive();
        /**
         * Output same as -> {@linkplain sportsCarVehicleWithStrategy.drive()} Method used above
         * But the Code is not duplicated and written only once at {@link com.beingadish.learning.WithStrategy.DriveStrategies.SpecialStrategy}
         * */
        offRoadingCarVehicleWithStrategy.drive();

    }
}