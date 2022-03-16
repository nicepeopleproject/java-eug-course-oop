package myExample.behavioralPatterns.mediator;

public class Client {
    public static void main(String[] args) {
        SimpleLoanPlatform loanPlatform = new SimpleLoanPlatform();
        User lender1 = new Lender(1000);
        User lender2 = new Lender(100000);
        User borrower1 = new Borrower(10, loanPlatform);
        User borrower2 = new Borrower(-10, loanPlatform);
        loanPlatform.addLender(lender1);
        loanPlatform.addLender(lender2);
        loanPlatform.addBorrower(borrower1);
        loanPlatform.addBorrower(borrower2);


        borrower1.askForLoan(100000);

    }
}
