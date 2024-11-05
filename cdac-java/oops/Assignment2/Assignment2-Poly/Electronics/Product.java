public class Product {
    protected String productId;
    protected String productName;
    
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public void displayProductInfo(){
        System.out.println("The name of product " + productName + "and it's id " + productId);
    }
}
