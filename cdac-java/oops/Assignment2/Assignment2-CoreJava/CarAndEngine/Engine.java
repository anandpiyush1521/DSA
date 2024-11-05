public class Engine {
    private String engineNumber;
    private String type;
    private int power;

    public Engine(String engineNumber, String type, int power) {
        this.engineNumber = engineNumber;
        this.type = type;
        this.power = power;
    }

    // Getters and Setters
    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineNumber='" + engineNumber + '\'' +
                ", type='" + type + '\'' +
                ", power=" + power +
                '}';
    }
}