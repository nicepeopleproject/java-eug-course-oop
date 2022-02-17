package myExample.myAbstractFactory.orc;

import myExample.myAbstractFactory.Weapon;

public class AxeWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Hitting with axe.");
    }
}
