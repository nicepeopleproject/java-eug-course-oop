package myExample.behavioralPatterns.memento;

public class Wallet {
    private int moneyAmount;

    public Wallet(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void load(Save save) {
        moneyAmount = save.getMoneyAmount();
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "moneyAmount=" + moneyAmount +
                '}';
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
