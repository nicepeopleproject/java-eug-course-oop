package myExample.creationalPatterns.abstractFactory.human;

import myExample.creationalPatterns.abstractFactory.Weapon;

public class GunWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Shooting with the gun.");
    }
}
