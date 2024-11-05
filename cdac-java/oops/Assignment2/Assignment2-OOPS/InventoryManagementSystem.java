class ProductInventory {
    private String productID;
    private String productName;
    private int stockQuantity;
    private double price;

    // Constructor to initialize the product
    public ProductInventory(String productID, String productName, int stockQuantity, double price) {
        this.productID = productID;
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    // Method to add stock
    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " units added. New stock level for " + productName + ": " + stockQuantity);
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }

    // Method to remove stock
    public void removeStock(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println(quantity + " units removed. New stock level for " + productName + ": " + stockQuantity);
        } else if (quantity > stockQuantity) {
            System.out.println("Insufficient stock to remove " + quantity + " units.");
        } else {
            System.out.println("Invalid quantity to remove.");
        }
    }

    // Method to display current stock level
    public void displayStock() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Current Stock Level: " + stockQuantity);
        System.out.println("Price per unit: $" + price);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args){
        ProductInventory product = new ProductInventory("P001", "Samsung-Laptop", 50, 59000);
        
        product.displayStock();
        product.addStock(10);
        product.removeStock(5);
        product.removeStock(60);
        product.displayStock();
    }
}
