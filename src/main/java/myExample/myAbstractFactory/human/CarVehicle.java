package myExample.myAbstractFactory.human;

import myExample.myAbstractFactory.Vehicle;

public class CarVehicle implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding a car");
    }
}
