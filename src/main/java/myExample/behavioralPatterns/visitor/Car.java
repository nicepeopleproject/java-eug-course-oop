package myExample.behavioralPatterns.visitor;

public abstract class Car {
    private Wheel wheel;

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
