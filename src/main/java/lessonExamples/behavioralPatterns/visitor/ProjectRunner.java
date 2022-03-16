package lessonExamples.behavioralPatterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer jun = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(jun);
        System.out.println("Senior in action...");
        project.beWritten(senior);
    }
}
