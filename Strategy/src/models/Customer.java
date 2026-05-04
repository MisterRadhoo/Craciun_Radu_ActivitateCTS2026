package models;

public class Customer {

     private String name;
     private PaymentMethod paymentMethod;  // has-a relationship, reference paymentMethod Inteface

    public Customer(String name) {
        super();
        this.name = name;
        this.paymentMethod =  new Cash();   // instance of class Cash
    }
    public Customer(String name, PaymentMethod paymentMethod) {
        super();
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

     public void payment(double paymentAmount) {
         paymentMethod.payment(this.name, paymentAmount );
     }

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public PaymentMethod getPaymentMethod() {
         return this.paymentMethod;
     }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
