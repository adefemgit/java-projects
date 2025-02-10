package transaction.payment;

public class payPalPayment extends payment {
    @Override
    void processPayment(double amount){
        System.out.println("processing paypal payment of $" + amount);
    }

}
