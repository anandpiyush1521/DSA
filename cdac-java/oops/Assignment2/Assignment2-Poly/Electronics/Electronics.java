public class Electronics extends Product{
    private String warantyPeriod;

    public Electronics(String productId, String productName, String warantyPeriod){
        super(productId, productName);
        this.warantyPeriod = warantyPeriod;
    }

    @Override
    public void displayProductInfo(){
        System.out.println("The name of product " + productName + "and it's id " + productId + " and it's waranty period is " + warantyPeriod);
    }
}
