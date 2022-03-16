package myExample.behavioralPatterns.state;

public class OrderTransferToCourier implements OrderStatus {
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Looking for courier...");
        System.out.println("Transfer to courier...");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
