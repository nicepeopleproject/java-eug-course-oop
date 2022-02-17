package myExample.myAbstractFactory.orc;

import myExample.myAbstractFactory.Vehicle;

public class MotorbikeVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Ride motorbike.");
    }
}
