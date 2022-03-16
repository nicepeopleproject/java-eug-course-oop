package myExample.facade;

public class Orc {
    protected myExample.facade.Weapon weapon;

    public Orc(myExample.facade.Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("FOR THE HORDE!!!!");
        System.out.printf("Hit with %s!\n", weapon.getName());
    }
}
