package myExample.behavioralPatterns.state;

public class OrderEquipment implements OrderStatus{

    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Sending order to storehouse...");
        System.out.println("Assembling order... ");
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
