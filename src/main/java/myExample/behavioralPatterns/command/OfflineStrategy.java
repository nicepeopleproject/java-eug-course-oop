package myExample.behavioralPatterns.command;

public class OfflineStrategy implements Strategy{
    @Override
    public void contactClient() {
        System.out.println("Handshake!!");
    }

    @Override
    public void giveAnAdvice() {
        System.out.println("Look here!");
    }
}
