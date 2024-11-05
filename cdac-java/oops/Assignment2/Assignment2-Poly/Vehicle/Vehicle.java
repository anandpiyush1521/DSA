public class Vehicle {
    protected String make;
    protected String model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
