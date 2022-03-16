package myExample.factoryMethod;

enum PaymentMethod {
    VISA, MasterCard
}

public class MyFactoryMethod {
    public static void main(String[] args) {
        CashRegister.processThePayment(500, PaymentMethod.MasterCard);
        CashRegister.processThePayment(500, PaymentMethod.VISA);
    }
}

class CashRegister {
    static void processThePayment(int amount, PaymentMethod paymentMethod) {
        createPaymentFactoryByPaymentMethod(paymentMethod).createPayment().pay(amount);
    }

    static PaymentFactory createPaymentFactoryByPaymentMethod(PaymentMethod paymentMethod) {
        if (paymentMethod.equals(PaymentMethod.VISA)) {
            return new VisaPaymentFactory();
        } else if (paymentMethod.equals(PaymentMethod.MasterCard)) {
            return new MastercardPaymentFactory();
        } else {
            throw new RuntimeException(paymentMethod + " is unknown.");
        }
    }
}

interface Payment {
    void pay(int amount);
}

class MastercardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.printf("Mastercard: The payment in the amount of $%d is made.\n", amount);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Visa: We are sorry, not enough money at you card at the moment.");
    }
}

class VisaPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.printf("The payment in the amount of $%d is made.\n", amount);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully made.");
    }
}

interface PaymentFactory {
    Payment createPayment();
}

class MastercardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new MastercardPayment();
    }
}

class VisaPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new VisaPayment();
    }
}