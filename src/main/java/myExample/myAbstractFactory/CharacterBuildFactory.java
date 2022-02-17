package myExample.myAbstractFactory;

public interface CharacterBuildFactory {
    Vehicle getVehicle();

    Weapon getWeapon();

    Pet getPet();
}
