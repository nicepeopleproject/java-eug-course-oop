package myExample.behavioralPatterns.visitor;

public class WheelSetter19R implements WheelSetter {
    @Override
    public void setWheel(Car car) {
        car.setWheel(new Wheel(19.));
        System.out.println("Set 19r wheels to car.");
    }
}
