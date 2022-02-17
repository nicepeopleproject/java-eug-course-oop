package myExample.myAbstractFactory.troll;

import myExample.myAbstractFactory.Weapon;

public class BowWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Shooting an arrow.");
    }
}
