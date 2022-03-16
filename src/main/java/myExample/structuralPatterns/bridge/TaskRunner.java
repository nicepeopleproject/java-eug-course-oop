package myExample.bridge;

public class TaskRunner {
    public static void main(String[] args) {
        Task[] tasks = {new MediumTask(new LazyWorker()), new SmallTask(new HugeWorker())};
        for (Task task: tasks){
            task.doTask();
        }
    }
}
