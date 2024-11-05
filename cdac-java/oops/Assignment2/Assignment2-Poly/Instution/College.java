public class College extends Instution{
    private int numberOfFaculties;
    
    public College(String name, String location, int numberOfFaculties) {
        super(name, location);
        this.numberOfFaculties = numberOfFaculties;
    }

    @Override
    public String getSummary(){
        return super.getSummary() + "\nNumber of Faculties: " + numberOfFaculties;
    }
}
