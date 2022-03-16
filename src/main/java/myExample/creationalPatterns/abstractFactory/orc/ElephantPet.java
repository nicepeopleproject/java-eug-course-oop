package myExample.creationalPatterns.abstractFactory.orc;


import myExample.creationalPatterns.abstractFactory.Pet;

public class ElephantPet implements Pet {
    @Override
    public void voice() {
        System.out.println("tu-tu");
    }
}
