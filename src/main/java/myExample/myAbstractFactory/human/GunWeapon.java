package myExample.myAbstractFactory.human;

import myExample.myAbstractFactory.Weapon;

public class GunWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Shooting with the gun.");
    }
}
