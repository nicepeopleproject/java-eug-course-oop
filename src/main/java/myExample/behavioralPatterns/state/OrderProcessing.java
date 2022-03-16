package myExample.behavioralPatterns.state;

public class OrderProcessing implements OrderStatus {
    @Override
    public void makeCorrespondingAction(Order order) {
        System.out.println("Checking goods at storehouse...");
        System.out.println("Calling client...");
        // if all successfully => next step
        order.nextStep();
        order.makeCorrespondingAction();
    }
}
