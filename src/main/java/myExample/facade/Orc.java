package myExample.facade;

public class Orc {
    protected Weapon weapon;

    public Orc(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("FOR THE HORDE!!!!");
        System.out.printf("Hit with %s!\n", weapon.getName());
    }
}
