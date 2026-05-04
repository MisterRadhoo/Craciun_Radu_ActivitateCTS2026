package models;

// Strategy Concrete
public class Card implements PaymentMethod{

    @Override
    public void payment(String customerName, double paymentAmount) {
        System.out.println(customerName + " wants to pay with credit card the amount of: " + paymentAmount + " $ ");
    }
}
