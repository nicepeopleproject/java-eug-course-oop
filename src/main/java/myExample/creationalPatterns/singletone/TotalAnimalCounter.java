package myExample.singletone;

import java.util.concurrent.atomic.AtomicInteger;

public class TotalAnimalCounter {
    private static AtomicInteger animalCounter = new AtomicInteger(0);
    private static TotalAnimalCounter totalAnimalCounter;

    private TotalAnimalCounter() {
    }

    public static TotalAnimalCounter getTotalAnimalCounter() {
        if (totalAnimalCounter == null) {
            totalAnimalCounter = new TotalAnimalCounter();
        }
        return totalAnimalCounter;
    }

    public void foundNewAnimal() {
        animalCounter.incrementAndGet();
    }

    public void animalDied() {
        animalCounter.decrementAndGet();
    }

    public int getCurrentAnimalAmount() {
        return animalCounter.get();
    }

}
