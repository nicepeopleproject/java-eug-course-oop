package myExample.bridge;

public class MediumTask extends Task {
    protected MediumTask(Worker worker) {
        super(worker);
    }

    @Override
    public void doTask() {
        System.out.println("Start doing medium task");
        worker.work();
    }
}
