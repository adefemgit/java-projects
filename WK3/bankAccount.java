package WK3;

import packageMethod.BankAccount;

public class bankAccount {

    String accountNumber;
    String accountHolder;
    double balance;
    static double interestRate = 5.0;
    public bankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited = $" + amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if (amount > 0){
            balance -= amount;
            System.out.println("amount withdrawn: $" + amount);
        }
    }

    void interestRate(){
        double interest = this.balance * (interestRate / 100);
        this.balance += interest;
        System.out.println("Applied interest " + interest + "to account "+ accountNumber);
    }

    public void displayDetails(){
        System.out.println("Here is the summary of your account details: ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolder);
        System.out.println("Account balance: $" + balance);

    }


    public static void main(String [] args){
        bankAccount account1 = new bankAccount("122123323443","Tijani Rufus",5000 );

        account1.displayDetails();
        account1.deposit(1000);
        account1.withdraw(2000);
        account1.interestRate();
        account1.displayDetails();


    }
}
