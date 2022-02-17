package myExample.bridge;

public class HugeWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Huge worker is working very very fast.");
    }
}
