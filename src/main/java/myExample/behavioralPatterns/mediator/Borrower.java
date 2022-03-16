package myExample.behavioralPatterns.mediator;

public class Borrower implements User {
    private int currentMoneyAmount;
    LoanPlatform loanPlatform;

    public Borrower(int currentMoneyAmount, LoanPlatform loanPlatform) {
        this.currentMoneyAmount = currentMoneyAmount;
        this.loanPlatform = loanPlatform;
    }

    @Override
    public boolean doYouAgreeWithContract() {
        return true;
    }

    @Override
    public void askForLoan(int loanAmount) {
        User lender = loanPlatform.findLender(loanAmount);
        if (lender != null) {
            Contract contract = loanPlatform.connectLenderAndBorrower(lender, this, loanAmount);
            if (contract.isSigned()) {
                System.out.printf("Contract with %d amount successfully signed.", loanAmount);
            }
        } else {
            System.out.println("Amount is too large, nobody can give you a loan. We are sorry.");
        }
    }

    @Override
    public int getCurrentMoneyAmount() {
        return currentMoneyAmount;
    }

    @Override
    public void giveLoan(int loanAmount) {
        System.out.println("Borrower never give loans.");
    }

    @Override
    public void receiveLoan(int loanAmount) {
        currentMoneyAmount += loanAmount;
    }
}
