package myExample.behavioralPatterns.command;

public class Manager {
    private Action giveAnAdvice;
    private Action contactClient;

    public Manager(Action giveAnAdvice, Action contactClient) {
        this.giveAnAdvice = giveAnAdvice;
        this.contactClient = contactClient;
    }

    public void giveAnAdvice() {
        giveAnAdvice.act();
    }


    public void contactClient() {
        contactClient.act();
    }
}
