package myExample.behavioralPatterns.template;

public class Rectangular extends TwoDimensionalFigure {
    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double square() {
        return a * b;
    }
}
