package getsandsets;

public class BankAccount{

    String accountHolderName;
    String accountNumber;
    double balance;


    public BankAccount(String accountHolderName, String accountNumber,  double initialBalance){

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
        else{
            System.out.println("Initial balance cannot be negative ");
            this.balance = 0;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited $" + amount + ".New balance $" + balance);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }


    }




    public static void main(String [] args){

    }
}
