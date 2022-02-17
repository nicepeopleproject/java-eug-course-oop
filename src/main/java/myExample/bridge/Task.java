package myExample.bridge;

public abstract class Task {
    protected Worker worker;

    protected Task(Worker worker) {
        this.worker = worker;
    }

    public abstract void doTask();
}
