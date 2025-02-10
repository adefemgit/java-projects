package transaction.payment;

public class CashPayment extends payment {

    @Override
    void processPayment(double amount){
        System.out.println("Processing cash payment of $" + amount);
    }
}
