package myExample.behavioralPatterns.mediator;

public interface User {
    boolean doYouAgreeWithContract();

    void askForLoan(int loanAmount);

    int getCurrentMoneyAmount();

    void giveLoan(int loanAmount);

    void receiveLoan(int loanAmount);
}
