public class School extends Instution{
    private int numberOfStudents;
    
    public School(String name, String location, int numberOfStudents){
        super(name, location);
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String getSummary(){
        return super.getSummary() + "\nNumber of Students: " + numberOfStudents;
    }
}
