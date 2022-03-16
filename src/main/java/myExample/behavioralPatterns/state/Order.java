package myExample.behavioralPatterns.state;

public class Order {
    private OrderStatus currentStatus;

    public Order() {
        currentStatus = new OrderRegistration();
        currentStatus.makeCorrespondingAction(this);
    }

    public void nextStep() {
        if (currentStatus instanceof OrderRegistration) {
            currentStatus = new OrderProcessing();
        } else if (currentStatus instanceof OrderProcessing) {
            currentStatus = new OrderEquipment();
        } else if (currentStatus instanceof OrderEquipment) {
            currentStatus = new OrderTransferToDeliveryService();
        } else if (currentStatus instanceof OrderTransferToDeliveryService) {
            currentStatus = new OrderDeliveryByCourier();
        } else if (currentStatus instanceof OrderDeliveryByCourier) {
            currentStatus = new OrderReceiving();
        } else if (currentStatus instanceof OrderReceiving) {
            System.out.println("Order successfully received.");
        }
    }

    public void makeCorrespondingAction() {
        if (!(currentStatus instanceof OrderReceiving)) {
            currentStatus.makeCorrespondingAction(this);
        }else{
            System.out.println("Order already received.");
        }
    }
}
