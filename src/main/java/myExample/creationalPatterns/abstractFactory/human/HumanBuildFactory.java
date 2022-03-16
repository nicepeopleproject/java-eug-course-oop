package myExample.creationalPatterns.abstractFactory.human;

import myExample.creationalPatterns.abstractFactory.CharacterBuildFactory;
import myExample.creationalPatterns.abstractFactory.Pet;
import myExample.creationalPatterns.abstractFactory.Vehicle;
import myExample.creationalPatterns.abstractFactory.Weapon;

public class HumanBuildFactory  implements CharacterBuildFactory {
    @Override
    public Vehicle getVehicle() {
        return new CarVehicle();
    }

    @Override
    public Weapon getWeapon() {
        return new GunWeapon();
    }

    @Override
    public Pet getPet() {
        return new LionPet();
    }
}
