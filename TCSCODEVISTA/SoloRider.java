import java.util.*;
class Vehicle {
    String id;
    int[] coordinates;

    Vehicle(String id, int x, int y) {
        this.id = id;
        this.coordinates = new int[]{x, y};
    }
}

public class SoloRider {

    private static int calculateDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }

    private static int assignVehicles(Map<String, int[]> passengers, Map<String, Vehicle> vehicles) {
        Map<String, String> allocatedVehicles = new TreeMap<>();
        int totalDistance = 0;

        for (String passenger : passengers.keySet()) {
            int[] passengerCoordinates = passengers.get(passenger);
            int minDistance = Integer.MAX_VALUE;
            String closestVehicle = "";

            for (String vehicle : vehicles.keySet()) {
                if (vehicles.get(vehicle).id.isEmpty()) {
                    int[] vehicleCoordinates = vehicles.get(vehicle).coordinates;

                    int distance = calculateDistance(passengerCoordinates, vehicleCoordinates);

                    if (distance < minDistance || (distance == minDistance && vehicle.compareTo(closestVehicle) < 0)) {
                        minDistance = distance;
                        closestVehicle = vehicle;
                    }
                }
            }

            if (minDistance == Integer.MAX_VALUE) {
                System.out.println("No available vehicles for passenger: " + passenger);
                return -1; // indicating an error
            }

            allocatedVehicles.put(passenger, closestVehicle);
            vehicles.get(closestVehicle).id = passenger;
            totalDistance += minDistance;
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Map<String, int[]> passengers = new HashMap<>();
            Map<String, Vehicle> vehicles = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String name = scanner.next();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                passengers.put(name, new int[]{x, y});
            }

            for (int i = 0; i < M; i++) {
                String vehicleId = scanner.next();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                vehicles.put(vehicleId, new Vehicle("", x, y));
            }

            // Call the function to get the minimum distance traveled
            int minimumDistance = assignVehicles(passengers, vehicles);

            // Print the result
            if (minimumDistance != -1) {
                System.out.print(minimumDistance);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
