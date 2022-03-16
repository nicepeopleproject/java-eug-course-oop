package myExample.creationalPatterns.abstractFactory.troll;


import myExample.creationalPatterns.abstractFactory.CharacterBuildFactory;
import myExample.creationalPatterns.abstractFactory.Pet;
import myExample.creationalPatterns.abstractFactory.Vehicle;
import myExample.creationalPatterns.abstractFactory.Weapon;

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
