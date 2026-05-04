package models;

// Strategy Concrete
public class Voucher implements PaymentMethod {

    @Override
    public void payment(String customerName, double paymentAmount) {
        System.out.println(customerName + " wants to pay her vacation with voucher, the amount required is: " + paymentAmount + " $ ");
    }
}
