package myExample.behavioralPatterns.command;

public class ContactClientAction implements Action{
    Strategy strategy;

    public ContactClientAction(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void act() {
        strategy.contactClient();
    }
}
