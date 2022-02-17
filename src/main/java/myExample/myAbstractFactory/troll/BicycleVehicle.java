package myExample.myAbstractFactory.troll;

import myExample.myAbstractFactory.Vehicle;

public class BicycleVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding a bike");
    }
}
