import java.util.*;
class Product{
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    //constructor
    public Product(String productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //getter and setter
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void displayProductDetails(){
        System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class ShoppingCart{
    private List<Product> cart;

    public ShoppingCart(){
        cart = new ArrayList<>();
    }

    //method to add product to the cart
    public void addProductToCart(Product product){
        for(Product p : cart){
            if(p.getProductId().equals(product.getProductId())){
                p.setQuantity(p.getQuantity() + product.getQuantity());
                System.out.println(product.getProductName() + " quantity updated in the cart.");
                return;
            }
        }
        cart.add(product);
        System.out.println(product.getProductName() + " added to the cart");
    }

    public void removeProductFromCart(String productId){
        for(Product p : cart){
            if(p.getProductId().equals(productId)){
                cart.remove(p);
                System.out.println(p.getProductName() + " removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    public double calculateBill(){
        double totalBill = 0;
        for(Product p : cart){
            totalBill += p.getPrice() * p.getQuantity();
        }
        return totalBill;
    }

    public void displayCart(){
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Products in cart:");
            for (Product p : cart) {
                p.displayProductDetails();
            }
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        
        Product product1 = new Product("P54789", "Laptop", 45879.00, 2);

        Product product2 = new Product("P78945", "Phones", 7894.00, 3);

        Product product3 = new Product("P54698", "Buds", 1200.00, 5);

        cart.addProductToCart(product1);
        cart.addProductToCart(product2);
        cart.addProductToCart(product3);

        //cart.displayCart();

        cart.addProductToCart(new Product("P12365", "Bags", 5463.00, 9));

        //cart.displayCart();

        cart.removeProductFromCart("P54698");

        cart.displayCart();

        double totalBill = cart.calculateBill();
        System.out.println("\nTotal Bill: $" + totalBill);

    }
}
