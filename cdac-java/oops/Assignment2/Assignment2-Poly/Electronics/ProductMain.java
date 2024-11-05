public class ProductMain {
    public static void main(String[] args) {
        // Create an instance of the class
        Clothing clothing = new Clothing("CLOTH001", "T-Shirt", 40);
        clothing.displayProductInfo();
        System.out.println();
        
        Electronics electronics = new Electronics("ELEC001", "Mobile", "Samsung");
        electronics.displayProductInfo();
    }   
}
