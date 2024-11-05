public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        System.out.println("Car Details: ");
        car.displayDetails();
        System.out.println("");

        Truck truck = new Truck("Ford", "F-150", 5.5);
        System.out.println("Truck Details: ");
        truck.displayDetails();
    }   
}
