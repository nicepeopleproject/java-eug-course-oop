package myExample.adapter;

public class AdapterCarToSelfDrivenCar extends Car implements SelfDrivenCar{
    @Override
    public void lock() {
        closeCar();
    }

    @Override
    public void open() {
        openCar();
    }

    @Override
    public void drive() {
        driveCar();
    }
}
