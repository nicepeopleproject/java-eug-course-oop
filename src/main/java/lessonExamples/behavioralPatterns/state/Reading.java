package lessonExamples.behavioralPatterns.state;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just reading book...");
    }
}
