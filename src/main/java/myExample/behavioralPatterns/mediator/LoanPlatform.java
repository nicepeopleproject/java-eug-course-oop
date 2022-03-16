package myExample.behavioralPatterns.mediator;

public interface LoanPlatform {
    User findLender(int loanAmount);

    Contract connectLenderAndBorrower(User lender, User borrower, int loanAmount);
}
