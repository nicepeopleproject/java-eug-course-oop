package myExample.creationalPatterns.abstractFactory.human;

import myExample.creationalPatterns.abstractFactory.Pet;

public class LionPet implements Pet {
    @Override
    public void voice() {
        System.out.println("myau-mayu");
    }
}
