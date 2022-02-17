package myExample.composite;

public class Polygon {
    public static void main(String[] args) {
        Ammunition ammunition = new Ammunition();
        ammunition.addWeapon(new AxeWeapon());
        ammunition.addWeapon(new AxeWeapon());
        ammunition.addWeapon(new Sword());

        ammunition.testAllWeapons();
    }
}
