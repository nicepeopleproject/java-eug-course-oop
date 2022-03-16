package myExample.behavioralPatterns.strategy;

public class RangedCombat implements  Combat{
    @Override
    public void strike() {
        System.out.println("Hitting with bow...");
    }
}
