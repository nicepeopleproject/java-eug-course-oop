package lessonExamples.decorator;

public class DeveloperDecorator implements lessonExamples.decorator.Developer {
    lessonExamples.decorator.Developer developer;

    public DeveloperDecorator(lessonExamples.decorator.Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
