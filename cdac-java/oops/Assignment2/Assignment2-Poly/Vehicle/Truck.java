public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, double cargoCapacity) {
        super(make, model);
        this.cargoCapacity = cargoCapacity;
    }

    //override display method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
