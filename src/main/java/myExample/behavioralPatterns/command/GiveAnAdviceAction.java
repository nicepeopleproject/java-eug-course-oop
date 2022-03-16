package myExample.behavioralPatterns.command;

public class GiveAnAdviceAction implements Action {
    Strategy strategy;

    public GiveAnAdviceAction(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void act() {
        strategy.giveAnAdvice();
    }
}
