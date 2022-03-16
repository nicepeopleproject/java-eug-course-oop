package myExample.creationalPatterns.abstractFactory.human;

import myExample.creationalPatterns.abstractFactory.Vehicle;

public class CarVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding a car");
    }
}
