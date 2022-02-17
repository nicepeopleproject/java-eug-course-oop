package myExample.mySingletone;

public class Main {
    public static void main(String[] args) {
        TotalAnimalCounter totalAnimalCounter = TotalAnimalCounter.getTotalAnimalCounter();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.foundNewAnimal();
        totalAnimalCounter.animalDied();
        totalAnimalCounter.foundNewAnimal();
        System.out.println("total current animal count: "+ totalAnimalCounter.getCurrentAnimalAmount());
    }
}
