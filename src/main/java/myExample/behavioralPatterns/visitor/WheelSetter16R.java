package myExample.behavioralPatterns.visitor;

public class WheelSetter16R implements WheelSetter{
    @Override
    public void setWheel(Car car) {
        car.setWheel(new Wheel(16.));
        System.out.println("Set 16r wheels to car.");
    }
}
