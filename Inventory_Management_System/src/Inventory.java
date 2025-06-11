import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Product> products;


    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product){
        if(products.containsKey(product.getProductId())){
            throw new IllegalArgumentException("Product already exists");
        }
        products.put(product.getProductId(), product);
    }

    public Product getProduct(String productId){
        if(!products.containsKey(productId)){
          return null;
        }
        else return products.get(productId);

    }

    public void updateProductQuantity(String productId, int quantity){
        Product product = products.get(productId);
        if(product != null){
            product.setQuantityInStock(quantity);
        }
        else throw new IllegalArgumentException("Product does not exist");


    }

    public void removeProduct(String productId){
        products.remove(productId);
    }

    public boolean sellProducts(String productId, int quantity){
        Product product = products.get(productId);
        if(product != null && product.getQuantityInStock() >= quantity){
            product.setQuantityInStock(product.getQuantityInStock() - quantity);
            return true;

        }
        return false;
    }

    public void displayAllProducts(){
        for(Product product : products.values()){
            System.out.println(product);
        }
    }
}
