package myExample.behavioralPatterns.command;

public class OnlineStrategy implements Strategy{
    @Override
    public void contactClient() {
        System.out.println("Saying hello.");
    }

    @Override
    public void giveAnAdvice() {
        System.out.println("Go to url...");
    }
}
