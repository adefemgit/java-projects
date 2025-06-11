public class Product {
    String productId;
    String productName;
    Double productPrice;
    int QuantityInStock;
    String Category;


    public Product(String productId, String productName, Double productPrice, int QuantityInStock, String Category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.QuantityInStock = QuantityInStock;
        this.Category = Category;

    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityInStock() {
        return QuantityInStock;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public String getCategory() {
        return Category;
    }

    public Double setProductPrice(){
        return productPrice;
    }

    public int setQuantityInStock(int quantity){
        return QuantityInStock;
    }

    public String toString(){
        return productId + " " + productName + " " + productPrice + " " + QuantityInStock + " " + Category;
    }
}
