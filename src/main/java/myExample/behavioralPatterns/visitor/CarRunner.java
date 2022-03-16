package myExample.behavioralPatterns.visitor;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new BmwCar();
        WheelSetter wheelSetter16R = new WheelSetter16R();
        WheelSetter wheelSetter19R = new WheelSetter19R();
        wheelSetter16R.setWheel(car);
        wheelSetter19R.setWheel(car);
    }
}
