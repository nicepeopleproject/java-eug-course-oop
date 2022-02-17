package myExample.myAbstractFactory;

import myExample.myAbstractFactory.troll.TrollBuildFactory;

public class Main {
    public static void main(String[] args) {
        CharacterBuildFactory characterBuildFactory = new TrollBuildFactory();
        characterBuildFactory.getPet().voice();
        characterBuildFactory.getVehicle().ride();
        characterBuildFactory.getWeapon().hit();
    }
}
