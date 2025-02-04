package Banking_System;

public class BankAccount {

     int accountNumber;
     double balance;



    public BankAccount( double balance, int accountNumber){

        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public void deposit(double amount){
       if(amount > 0){
           balance += amount;
           System.out.println("Deposited $" + amount);
       }
       else{
           System.out.println("invalid!");
       }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        }
        else{
            System.out.println("The amount deposited isnt sufficient, please add more money.thanks");
        }
    }

    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: $" + balance);
    }
}
