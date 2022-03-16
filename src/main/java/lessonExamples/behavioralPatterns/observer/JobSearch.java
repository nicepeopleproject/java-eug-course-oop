package lessonExamples.behavioralPatterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopmentJobSite javaDevelopmentJobSite = new JavaDevelopmentJobSite();
        javaDevelopmentJobSite.addVacancy("Java1");
        javaDevelopmentJobSite.addVacancy("Java2");
        javaDevelopmentJobSite.addVacancy("Java3");
        javaDevelopmentJobSite.addVacancy("Java4");

        Observer subscriber1 = new Subscriber("1");
        Observer subscriber2 = new Subscriber("2");
        Observer subscriber3 = new Subscriber("3");

        javaDevelopmentJobSite.addObserver(subscriber1);
        javaDevelopmentJobSite.addObserver(subscriber2);
        javaDevelopmentJobSite.addObserver(subscriber3);

        javaDevelopmentJobSite.addVacancy("Java5");
        javaDevelopmentJobSite.removeVacancy("Java1");
    }
}
