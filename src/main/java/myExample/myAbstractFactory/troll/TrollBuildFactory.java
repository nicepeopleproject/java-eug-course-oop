package myExample.myAbstractFactory.troll;

import myExample.myAbstractFactory.CharacterBuildFactory;
import myExample.myAbstractFactory.Pet;
import myExample.myAbstractFactory.Vehicle;
import myExample.myAbstractFactory.Weapon;

public class TrollBuildFactory implements CharacterBuildFactory {
    @Override
    public Vehicle getVehicle() {
        return new BicycleVehicle();
    }

    @Override
    public Weapon getWeapon() {
        return new BowWeapon();
    }

    @Override
    public Pet getPet() {
        return new DogPet();
    }
}
