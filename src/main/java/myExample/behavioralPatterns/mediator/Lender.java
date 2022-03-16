package myExample.behavioralPatterns.mediator;

public class Lender implements User {
    private int currentMoneyAmount;

    public Lender(int currentMoneyAmount) {
        this.currentMoneyAmount = currentMoneyAmount;
    }

    @Override
    public boolean doYouAgreeWithContract() {
        return true;
    }

    @Override
    public void askForLoan(int loanAmount) {
        System.out.println("Lender never asks for loans.");
    }

    @Override
    public int getCurrentMoneyAmount() {
        return currentMoneyAmount;
    }

    @Override
    public void giveLoan(int loanAmount) {
        currentMoneyAmount -= loanAmount;
    }

    @Override
    public void receiveLoan(int loanAmount) {
        System.out.println("Lender never receive loans;");
    }
}
