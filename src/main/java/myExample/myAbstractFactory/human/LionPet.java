package myExample.myAbstractFactory.human;

import myExample.myAbstractFactory.Pet;

public class LionPet implements Pet {
    @Override
    public void voice() {
        System.out.println("myau-mayu");
    }
}
