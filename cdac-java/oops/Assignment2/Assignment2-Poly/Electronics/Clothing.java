public class Clothing extends Product{
    private int dressSize;
    
    public Clothing(String productId, String productName, int dressSize){
        super(productId, productName);
        this.dressSize = dressSize;
    }

    public void displayProductInfo(){
        System.out.println("The name of product " + productName + "and it's id " + productId + " and it's size is " + dressSize);
    } 
}
