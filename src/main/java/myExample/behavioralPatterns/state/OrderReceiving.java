package myExample.behavioralPatterns.state;

public class OrderReceiving implements OrderStatus {
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Order receiving by client...");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
