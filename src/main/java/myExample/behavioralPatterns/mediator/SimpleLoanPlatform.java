package myExample.behavioralPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleLoanPlatform implements LoanPlatform {
    List<User> lenders = new ArrayList<>();
    List<User> borrowers = new ArrayList<>();

    public void addLender(User lender) {
        lenders.add(lender);
    }

    public void addBorrower(User borrower) {
        borrowers.add(borrower);
    }


    @Override
    public User findLender(int loanAmount) {
        for (User lender : lenders) {
            if (lender.getCurrentMoneyAmount() >= loanAmount) {
                return lender;
            }
        }
        return null;
    }

    @Override
    public Contract connectLenderAndBorrower(User lender, User borrower, int loanAmount) {
        Contract contract = new StandardContract(lender, borrower, loanAmount);
        contract.askLenderToSignContract();
        contract.askBorrowerToSignContract();

        if (contract.isSigned()) {
            lender.giveLoan(loanAmount);
            borrower.receiveLoan(loanAmount);
            return contract;
        }
        return contract;
    }
}
