public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    //overriding display method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
