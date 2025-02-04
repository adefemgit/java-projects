package Banking_System;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber);
        this.interestRate = interestRate;

    }

    public void addInterest(int interest){
        if(balance > 0){
            double interestAmount = balance * (interest / 100.0);
            balance += interestAmount;
            System.out.println("Interest added: $" + (balance * (interest / 100.0)));
        } else {
            System.out.println("No interest applied as balance is non-positive.");

        }
    }


}

