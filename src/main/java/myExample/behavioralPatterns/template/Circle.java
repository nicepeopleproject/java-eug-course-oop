package myExample.behavioralPatterns.template;

public class Circle extends TwoDimensionalFigure {
    private final double pi = 3.1415926535;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double square() {
        return r * r * pi;
    }
}
