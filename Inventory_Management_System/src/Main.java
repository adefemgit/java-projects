//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Lamp", 1000.0, 15, "Electronics");
        Product product2 = new Product("2", "Bread", 1500.0, 10, "Food");
        Product product3 = new Product("3", "Soda", 100.0, 10, "Beverages");


        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.displayAllProducts();

        

        inventory.displayAllProducts();
        }
    }
