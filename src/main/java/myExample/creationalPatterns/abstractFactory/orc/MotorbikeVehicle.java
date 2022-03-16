package myExample.creationalPatterns.abstractFactory.orc;


import myExample.creationalPatterns.abstractFactory.Vehicle;

public class MotorbikeVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Ride motorbike.");
    }
}
