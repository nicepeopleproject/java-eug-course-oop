package myExample.myAbstractFactory.human;

import myExample.myAbstractFactory.CharacterBuildFactory;
import myExample.myAbstractFactory.Pet;
import myExample.myAbstractFactory.Vehicle;
import myExample.myAbstractFactory.Weapon;

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
