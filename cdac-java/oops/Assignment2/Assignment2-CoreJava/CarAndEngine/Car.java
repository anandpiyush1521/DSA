public class Car {
    private String model;
    private String make;
    private Engine engine;

    public Car(String model, String make, Engine engine) {
        this.model = model;
        this.make = make;
        this.engine = engine;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Engine engine = new Engine("EN12345", "V8", 500);
        Car car = new Car("Mustang", "Ford", engine);

        System.out.println(car);
    }
}