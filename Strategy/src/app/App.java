package app;

import models.Card;
import models.Cash;
import models.Customer;
import models.Voucher;

public class App {

    static void main(String[] args) {
        Customer customer1 = new Customer("Ana Popescu");
        Customer customer2 = new Customer("Maria Alexandra", new Voucher());
        Customer customer3 = new Customer("Alex");
        customer3.setPaymentMethod(new Cash());
        customer3.payment(900);

        customer1.setPaymentMethod(new Card());
        customer1.payment(10000);

        customer2.payment(5000);
    }
}
