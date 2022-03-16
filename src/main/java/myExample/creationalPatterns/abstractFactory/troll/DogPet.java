package myExample.creationalPatterns.abstractFactory.troll;


import myExample.creationalPatterns.abstractFactory.Pet;

public class DogPet implements Pet {
    @Override
    public void voice() {
        System.out.println("gav-gav");
    }
}
