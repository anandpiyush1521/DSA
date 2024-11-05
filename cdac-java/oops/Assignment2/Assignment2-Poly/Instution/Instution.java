public class Instution {
    protected String name;
    protected String location;
    
    public Instution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getSummary() {
        return "Institution Name: " + name + "\nLocation: " + location;
    }
}
