package myExample.bridge;

public class SmallTask extends Task{
    protected SmallTask(Worker worker) {
        super(worker);
    }

    @Override
    public void doTask() {
        System.out.println("Start doing small task...");
        worker.work();
    }
}
