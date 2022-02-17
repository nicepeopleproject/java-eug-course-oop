package myExample.myAbstractFactory.troll;

import myExample.myAbstractFactory.Pet;

public class DogPet implements Pet {
    @Override
    public void voice() {
        System.out.println("gav-gav");
    }
}
