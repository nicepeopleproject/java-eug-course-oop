package myExample.facade;

public class Battle {
    War war = new War();
    Weapon weapon = new Weapon("Mace");
    Orc orc = new Orc(weapon);

    public void battle(){
        war.start();
        orc.fight();
        war.end();
    }
}
