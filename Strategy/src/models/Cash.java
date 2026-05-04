package models;

// Strategy Concrete
public class Cash implements PaymentMethod {

    @Override
    public void payment(String customerName, double paymentAmount) {
        System.out.println(customerName + " has to pay amount of " + paymentAmount + " $ in cash.");
    }
}
