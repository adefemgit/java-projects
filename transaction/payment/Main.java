package transaction.payment;

public class Main {
    public static void main(String [] args){
        payment [] payments = {
                new payPalPayment(),
                new CreditCardPayment(),
                new CashPayment()



            };

        double[] amounts = {143.5, 250.2, 300.3};
        for(int i = 0; i < payments.length; i++){
            payments[i].processPayment(amounts[i]);
        }
    }
}
