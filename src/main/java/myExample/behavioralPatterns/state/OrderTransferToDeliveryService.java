package myExample.behavioralPatterns.state;

public class OrderTransferToDeliveryService implements OrderStatus {
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Transfering oreder to delivery service...");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
