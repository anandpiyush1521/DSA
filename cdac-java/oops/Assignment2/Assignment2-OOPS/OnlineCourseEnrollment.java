import java.util.*;
class Student{
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void displayStudentDetails(){
        System.out.println("Student ID: " + studentId + ", Student Name: " + studentName);
    }
}

class Course{
    private String courseId;
    private String courseName;
    private String instructorName;
    private double fee;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, String instructorName, double fee){
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.fee = fee;
        this.enrolledStudents = new ArrayList<Student>();
    }

    //method to enroll student in course
    public void enrollStudent(Student student){
        enrolledStudents.add(student);
        System.out.println(student.getStudentName() + " enrolled in the course: " + courseName);
    }

    //method to view enrolled student
    public void viewEnrolledStudent(){
        if(enrolledStudents.isEmpty()){
            System.out.println("No student enrolled in the course: " + courseName);
        }else{
            System.out.println("Enrolled students in the course: " + courseName);
            for(Student student : enrolledStudents){
                student.displayStudentDetails();
            }
        }
    }

    //method to calculate total revenue
    public double calculateRevenue(){
        return fee * enrolledStudents.size();
    }

    //method to display course details
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName + ", Instructor: " + instructorName + ", Fee: $" + fee);
    }
}

public class OnlineCourseEnrollment {
    public static void main(String[] args){
        Student student1 = new Student("S1234", "Piyush Anand");
        Student student2 = new Student("S7894", "Nisha singh");
        Student student3 = new Student("S4561", "Raj Singh");

        Course javaCourse = new Course("C001", "Java Dev", "Nsnathan", 4569.00);

        javaCourse.displayCourseDetails();

        javaCourse.enrollStudent(student1);
        javaCourse.enrollStudent(student2);
        javaCourse.enrollStudent(student3);

        System.out.println("");

        System.out.println("List of all enrolled students: ");

        javaCourse.viewEnrolledStudent();

        double revenue = javaCourse.calculateRevenue();
        System.err.println("Total revenue is : " + revenue);
    }
}
