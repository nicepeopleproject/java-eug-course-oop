package myExample.behavioralPatterns.state;

public class OrderDeliveryByCourier implements OrderStatus{
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Delivering order...");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
