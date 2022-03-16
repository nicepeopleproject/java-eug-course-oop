package myExample.behavioralPatterns.memento;

public class Client {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000);
        Save save = new Save(wallet);
        System.out.println(wallet);
        wallet.setMoneyAmount(500);
        System.out.println(wallet);
        wallet.load(save);
        System.out.println(wallet);
    }
}
