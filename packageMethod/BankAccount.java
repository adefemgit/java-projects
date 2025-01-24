package packageMethod;

public class BankAccount{

    String  accountHolder;
    double balance;
    String accountNumber;


    public BankAccount(String accountHolder, String accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public void deposit(double amount){
        balance += amount;

        System.out.println("Successfully deposited: " + amount);
        System.out.println("New balance = " + balance);
    }
    public void withdraw(double amount){

        if (balance >= amount){
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount);
            System.out.println("Remaining balance " + balance);
        }
        else {
            System.out.println("Insufficient Funds");
        }

    }
    public void displayAccountDetails(){

        System.out.println("Account Holder: " + accountHolder );
        System.out.println("Current Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String [] args){
        BankAccount obj = new BankAccount("john doe","00123245", 500.0);

        obj.displayAccountDetails();
        obj.deposit(200);
        obj.withdraw(100);
        obj.withdraw(700);
        obj.displayAccountDetails();



    }
}
