import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Vehicle> vehicles;

    public RentalService() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void calculateTotalRentalCost(int days) {
        for (Vehicle vehicle : vehicles) {
            double cost = vehicle.calculateRentalCost(days);
            System.out.println(vehicle + " Rental Cost for " + days + " days: $" + cost);
        }
    }

    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        Vehicle car = new Car("ABC123", 50.0, 4, true);
        Vehicle motorcycle = new Motorcycle("XYZ789", 30.0, 600, false);

        rentalService.addVehicle(car);
        rentalService.addVehicle(motorcycle);

        rentalService.calculateTotalRentalCost(5);
    }
}