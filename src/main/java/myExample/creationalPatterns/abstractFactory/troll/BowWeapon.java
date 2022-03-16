package myExample.creationalPatterns.abstractFactory.troll;


import myExample.creationalPatterns.abstractFactory.Weapon;

public class BowWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Shooting an arrow.");
    }
}
