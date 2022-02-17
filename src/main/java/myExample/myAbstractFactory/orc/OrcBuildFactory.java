package myExample.myAbstractFactory.orc;

import myExample.myAbstractFactory.CharacterBuildFactory;
import myExample.myAbstractFactory.Pet;
import myExample.myAbstractFactory.Vehicle;
import myExample.myAbstractFactory.Weapon;

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
