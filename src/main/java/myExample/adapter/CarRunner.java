package myExample.adapter;

public class CarRunner {
    public static void main(String[] args) {
        SelfDrivenCar selfDrivenCar = new AdapterCarToSelfDrivenCar();
        selfDrivenCar.open();
        selfDrivenCar.drive();
        selfDrivenCar.lock();
    }
}
