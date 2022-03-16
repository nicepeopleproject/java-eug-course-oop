package myExample.creationalPatterns.abstractFactory.orc;

import myExample.creationalPatterns.abstractFactory.CharacterBuildFactory;
import myExample.creationalPatterns.abstractFactory.Pet;
import myExample.creationalPatterns.abstractFactory.Vehicle;
import myExample.creationalPatterns.abstractFactory.Weapon;

public class OrcBuildFactory implements CharacterBuildFactory {
    @Override
    public Vehicle getVehicle() {
        return new MotorbikeVehicle();
    }

    @Override
    public Weapon getWeapon() {
        return new AxeWeapon();
    }

    @Override
    public Pet getPet() {
        return new ElephantPet();
    }
}
