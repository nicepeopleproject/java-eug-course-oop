package myExample.behavioralPatterns.template;

public class StraightPrism {
    private double height;
    private TwoDimensionalFigure base;

    public StraightPrism(double height, TwoDimensionalFigure base) {
        this.height = height;
        this.base = base;
    }

    public double volume(){
        return base.square() * height;
    }
}
