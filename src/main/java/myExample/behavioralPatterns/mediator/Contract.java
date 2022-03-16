package myExample.behavioralPatterns.mediator;

public interface Contract {
    void askLenderToSignContract();

    void askBorrowerToSignContract();

    boolean isSigned();
}
