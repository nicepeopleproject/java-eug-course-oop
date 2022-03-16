package myExample.creationalPatterns.abstractFactory;
public interface CharacterBuildFactory {
    Vehicle getVehicle();

    Weapon getWeapon();

    Pet getPet();
}
