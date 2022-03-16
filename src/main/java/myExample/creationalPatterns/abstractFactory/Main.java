package myExample.creationalPatterns.abstractFactory;

import myExample.creationalPatterns.abstractFactory.troll.TrollBuildFactory;

public class Main {
    public static void main(String[] args) {
        CharacterBuildFactory characterBuildFactory = new TrollBuildFactory();
        characterBuildFactory.getPet().voice();
        characterBuildFactory.getVehicle().ride();
        characterBuildFactory.getWeapon().hit();
    }
}
