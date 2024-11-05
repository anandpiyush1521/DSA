class Room {
    private String roomNumber;
    private String roomType;
    private double ratePerNight;
    private boolean availabilityStatus;

    // Constructor to initialize the room
    public Room(String roomNumber, String roomType, double ratePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.ratePerNight = ratePerNight;
        this.availabilityStatus = true; // Room is available by default
    }

    // Method to book a room
    public void bookRoom() {
        if (availabilityStatus) {
            availabilityStatus = false; // Set availability to false
            System.out.println("Room " + roomNumber + " has been successfully booked.");
        } else {
            System.out.println("Room " + roomNumber + " is currently unavailable.");
        }
    }

    // Method to cancel a booking
    public void cancelBooking() {
        if (!availabilityStatus) {
            availabilityStatus = true; // Set availability to true
            System.out.println("Booking for room " + roomNumber + " has been successfully canceled.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked yet.");
        }
    }

    // Method to calculate the total amount for a stay
    public double calculateTotalAmount(int numberOfNights) {
        if (numberOfNights <= 0) {
            throw new IllegalArgumentException("Number of nights must be greater than zero.");
        }
        return numberOfNights * ratePerNight; // Calculate total amount
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Rate per Night: $" + ratePerNight);
        System.out.println("Availability: " + (availabilityStatus ? "Available" : "Booked"));
    }
}

public class HotelRoomBookingSystem {
    public static void main(String[] args) {
        Room room101 = new Room("101", "Deluxe", 150.00);
        
        room101.displayRoomDetails();
        room101.bookRoom();
        room101.bookRoom();

        int nights = 3;
        double totalAmount = room101.calculateTotalAmount(nights);
        System.out.println("Total amount for " + nights + " nights: $" + totalAmount);

        room101.cancelBooking();
        room101.displayRoomDetails();
    }
}
