package myExample.bridge;

public class LazyWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Lazy worker is working so lazy :-(");
    }
}
