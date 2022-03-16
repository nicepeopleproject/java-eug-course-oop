package myExample.behavioralPatterns.mediator;

public class StandardContract implements Contract {
    User lender;
    User borrower;
    int loanAmount;
    boolean lenderSign = false;
    boolean borrowerSign = false;


    public StandardContract(User lender, User borrower, int loanAmount) {
        this.lender = lender;
        this.borrower = borrower;
        this.loanAmount = loanAmount;
    }

    @Override
    public void askLenderToSignContract() {
        this.lenderSign = lender.doYouAgreeWithContract();
    }

    @Override
    public void askBorrowerToSignContract() {
        this.borrowerSign = borrower.doYouAgreeWithContract();
    }

    @Override
    public boolean isSigned() {
        return lenderSign && borrowerSign;
    }
}
