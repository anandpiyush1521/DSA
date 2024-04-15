import java.util.*;
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Passenger {
    String name;
    Point location;

    Passenger(String name, Point location) {
        this.name = name;
        this.location = location;
    }
}
class Vehicle {
    String number;
    Point location;

    Vehicle(String number, Point location) {
        this.number = number;
        this.location = location;
    }
}

public class RideShareSystem {
    private static int manhattanDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    private static Vehicle findNearestVehicle(Passenger passenger, Vehicle[] vehicles, boolean[] assigned) {
        int minDistance = Integer.MAX_VALUE;
        Vehicle nearestVehicle = null;
        for (int i = 0; i < vehicles.length; i++) {
            if (!assigned[i]) {
                int distance = manhattanDistance(passenger.location, vehicles[i].location);

                if (distance < minDistance || (distance == minDistance && vehicles[i].number.compareTo(nearestVehicle.number) < 0)) {
                    minDistance = distance;
                    nearestVehicle = vehicles[i];
                }
            }
        }
        assigned[nearestVehicle.hashCode() % vehicles.length] = true;
        return nearestVehicle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Passenger[] passengers = new Passenger[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            passengers[i] = new Passenger(name, new Point(x, y));
        }

        Vehicle[] vehicles = new Vehicle[m];
        for (int i = 0; i < m; i++) {
            String number = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            vehicles[i] = new Vehicle(number, new Point(x, y));
        }

        boolean[] assigned = new boolean[m];
        int totalDistance = 0;

        for (int i = 0; i < n; i++) {
            Vehicle assignedVehicle = findNearestVehicle(passengers[i], vehicles, assigned);
            totalDistance += manhattanDistance(passengers[i].location, assignedVehicle.location);
        }

        System.out.println(totalDistance);
    }
}
