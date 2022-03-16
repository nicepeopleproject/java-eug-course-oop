package myExample.behavioralPatterns.memento;

public class Save {
    int moneyAmount;


    public Save(Wallet wallet) {
        this.moneyAmount = wallet.getMoneyAmount();
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
