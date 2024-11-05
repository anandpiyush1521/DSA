public class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, double rentalPricePerDay, int engineDisplacement, boolean hasSidecar) {
        super(licensePlate, rentalPricePerDay);
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalPricePerDay() * days;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", rentalPricePerDay=" + getRentalPricePerDay() +
                ", engineDisplacement=" + engineDisplacement +
                ", hasSidecar=" + hasSidecar +
                '}';
    }
}