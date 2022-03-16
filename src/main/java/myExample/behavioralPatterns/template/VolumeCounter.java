package myExample.behavioralPatterns.template;

public class VolumeCounter {
    public static void main(String[] args) {
        StraightPrism straightPrism = new StraightPrism(10., new Circle(5.));
        StraightPrism straightPrism1 = new StraightPrism(10., new Rectangular(5, 4));
        System.out.println(straightPrism.volume());
        System.out.println(straightPrism1.volume());
    }
}
