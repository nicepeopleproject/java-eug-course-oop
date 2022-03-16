package myExample.creationalPatterns.abstractFactory.troll;


import myExample.creationalPatterns.abstractFactory.Vehicle;

public class BicycleVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding a bike");
    }
}
