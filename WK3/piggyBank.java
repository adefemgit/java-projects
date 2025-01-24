package WK3;

public class piggyBank {

    private double money;


    public piggyBank(int initialMoney){
        this.money = initialMoney;
    }

    public double balance(){
        return money;
    }


    public void depositMoney(double amount){
        if(amount > 0.0){
            money += amount;
            System.out.println("deposited: " + amount);
        }
        else{
            System.out.println("invalid!!");
        }



    }

    public void withdrawMoney(double amount){
        if (amount > money || amount < 0){
            System.out.println("Insufficient balance");

        }

        else{
            money -= amount;
            System.out.println("withrawn:" + amount);
        }

    }

    public void displayDetails(){
        System.out.println("Current balance : " +  balance());

    }

    public static void main(String [] args){
        piggyBank client1 = new piggyBank(20);

        client1.depositMoney(25.0);
        client1.withdrawMoney(10.0);
        client1.displayDetails();

    }

}
