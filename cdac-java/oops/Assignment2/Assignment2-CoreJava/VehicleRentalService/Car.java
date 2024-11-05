public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isAutomatic;

    public Car(String licensePlate, double rentalPricePerDay, int numberOfDoors, boolean isAutomatic) {
        super(licensePlate, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
        this.isAutomatic = isAutomatic;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalPricePerDay() * days;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", rentalPricePerDay=" + getRentalPricePerDay() +
                ", numberOfDoors=" + numberOfDoors +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}