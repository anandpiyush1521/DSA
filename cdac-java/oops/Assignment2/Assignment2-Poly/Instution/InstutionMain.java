public class InstutionMain {
    public static void main(String[] args){
        // Create an instance of the class
        School school = new School("Greenfield High School", "New York", 1200);
        System.out.println("School Summary:");
        System.out.println(school.getSummary());
        System.out.println();

        // Creating an instance of College
        College college = new College("Tech Valley College", "San Francisco", 200);
        System.out.println("College Summary:");
        System.out.println(college.getSummary());
    }    
}
