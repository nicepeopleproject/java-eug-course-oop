package myExample.creationalPatterns.abstractFactory.orc;


import myExample.creationalPatterns.abstractFactory.Weapon;

public class AxeWeapon implements Weapon {
    @Override
    public void hit() {
        System.out.println("Hitting with axe.");
    }
}
