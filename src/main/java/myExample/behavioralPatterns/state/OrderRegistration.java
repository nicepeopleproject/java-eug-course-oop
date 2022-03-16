package myExample.behavioralPatterns.state;

public class OrderRegistration implements OrderStatus {
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Registering order...");
        System.out.println("Choosing goods...");
        System.out.println("Filling gaps...");
        System.out.println("Submitting...");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
