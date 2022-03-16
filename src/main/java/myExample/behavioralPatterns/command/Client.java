package myExample.behavioralPatterns.command;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new OfflineStrategy();
        Manager manager = new Manager(new GiveAnAdviceAction(strategy), new ContactClientAction(strategy));
        manager.contactClient();
        manager.giveAnAdvice();
    }
}
