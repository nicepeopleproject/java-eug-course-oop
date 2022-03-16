package lessonExamples.behavioralPatterns.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.printf("Dear %s we have some changes in vacancies: ", name);
        System.out.println(vacancies);
    }
}
