package myExample.bridge;

public abstract class Task {
    protected myExample.bridge.Worker worker;

    protected Task(myExample.bridge.Worker worker) {
        this.worker = worker;
    }

    public abstract void doTask();
}
