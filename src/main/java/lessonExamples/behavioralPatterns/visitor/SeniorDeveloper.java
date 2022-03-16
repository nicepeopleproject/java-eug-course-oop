package lessonExamples.behavioralPatterns.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting project code...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Restarting database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
