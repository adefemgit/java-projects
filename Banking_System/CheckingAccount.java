package Banking_System;

public class CheckingAccount extends BankAccount {


    double overdraftLimit;

    public CheckingAccount(double balance, int accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;

    }

    public void withdraw(double amount) {
        overdraftLimit = 500.00;
        if (amount > 0 && (balance - amount >= -overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
        else {
            System.out.println("Withdrawal denied: Exceeds overdraft limit.");
        }
    }

}





