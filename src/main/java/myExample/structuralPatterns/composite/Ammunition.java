package myExample.composite;

import java.util.ArrayList;
import java.util.List;

public class Ammunition {
    private List<myExample.composite.Weapon> weapons = new ArrayList<>();


    public void addWeapon(myExample.composite.Weapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(myExample.composite.Weapon weapon) {
        weapons.remove(weapon);
    }

    public void testAllWeapons() {
        System.out.println("Start testing weapons...");
        for (myExample.composite.Weapon weapon : weapons) {
            weapon.hit();
        }
    }
}
