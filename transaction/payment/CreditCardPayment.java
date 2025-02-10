package transaction.payment;

public class CreditCardPayment extends payment {
@Override
    void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount);
    }
}
