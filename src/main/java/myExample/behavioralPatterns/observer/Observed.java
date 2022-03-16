package myExample.behavioralPatterns.observer;

import lessonExamples.behavioralPatterns.observer.Observer;

public interface Observed {

    void addObserver(lessonExamples.behavioralPatterns.observer.Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
