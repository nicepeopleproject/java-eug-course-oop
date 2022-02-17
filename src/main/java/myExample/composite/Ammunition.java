package myExample.composite;

import java.util.ArrayList;
import java.util.List;

public class Ammunition {
    private List<Weapon> weapons = new ArrayList<>();


    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        weapons.remove(weapon);
    }

    public void testAllWeapons() {
        System.out.println("Start testing weapons...");
        for (Weapon weapon : weapons) {
            weapon.hit();
        }
    }
}
