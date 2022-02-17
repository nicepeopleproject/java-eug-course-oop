package myExample.myAbstractFactory.orc;

import myExample.myAbstractFactory.Pet;

public class ElephantPet implements Pet {
    @Override
    public void voice() {
        System.out.println("tu-tu");
    }
}
