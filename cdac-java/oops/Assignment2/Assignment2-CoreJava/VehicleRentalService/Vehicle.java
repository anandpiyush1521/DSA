public abstract class Vehicle {
    private String licensePlate;
    private double rentalPricePerDay;

    public Vehicle(String licensePlate, double rentalPricePerDay) {
        this.licensePlate = licensePlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public abstract double calculateRentalCost(int days);
}