import java.util.*;
class Car{
    private String carModel;
    private String registrationNumber;
    private double rentalRatePerDay;
    private boolean isAvailable;

    // Constructor
    public Car(String carModel, String registrationNumber, double rentalRatePerDay) {
        this.carModel = carModel;
        this.registrationNumber = registrationNumber;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = true; // car is available by default when created
    }

    // Method to rent a car
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The car " + carModel + " has been rented.");
        } else {
            System.out.println("The car " + carModel + " is currently not available.");
        }
    }

    // Method to return a car
    public void returnCar(int daysRented) {
        if (!isAvailable) {
            double rentalCharges = calculateRentalCharges(daysRented);
            System.out.println("The car " + carModel + " has been returned.");
            System.out.println("Total rental charges for " + daysRented + " days: $" + rentalCharges);
            isAvailable = true;
        } else {
            System.out.println("The car was not rented out.");
        }
    }

    // Method to calculate rental charges
    private double calculateRentalCharges(int daysRented) {
        return daysRented * rentalRatePerDay;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Rental Rate per Day: $" + rentalRatePerDay);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

public class CarRentalSystem {
    public static void main(String[] args){
        Car car = new Car("Toyota Corolla", "ABC123", 40.0);

        // Displaying car details
        car.displayCarDetails();
        // Renting the car
        car.rentCar();
        // Trying to rent it again while it's unavailable
        car.rentCar();
        // Returning the car after 5 days
        car.returnCar(5);
        // Displaying car details after return
        car.displayCarDetails();
    }  
}
