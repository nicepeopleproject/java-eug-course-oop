package myExample.behavioralPatterns.observer;

import lessonExamples.behavioralPatterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Observed {
    List<Observer> observers = new ArrayList<>();
    int currentTemperature;

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {

        }
    }
}
