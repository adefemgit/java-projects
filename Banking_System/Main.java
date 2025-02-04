package Banking_System;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000.00, 121324,200.00);

        account.displayBalance();
        account.deposit(50.00);
        account.displayBalance();

        account.withdraw(1100);
        account.displayBalance();

    }
}
