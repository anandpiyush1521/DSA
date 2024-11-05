import java.util.*;
class Student{
    //name, rollNumber, marks
    private String name;
    private String rollNumber;
    private double marksMath;
    private double marksScience;
    private double marksEnglish;

    // Constructor
    public Student(String name, String rollNumber, double marksMath, double marksScience, double marksEnglish) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksMath = marksMath;
        this.marksScience = marksScience;
        this.marksEnglish = marksEnglish;
    }

    // Method to calculate total marks
    public double calculateTotalMarks() {
        return marksMath + marksScience + marksEnglish;
    }

    // Method to calculate average marks
    public double calculateAverageMarks() {
        return calculateTotalMarks() / 3;
    }

    // Method to determine grade based on average marks
    public String determineGrade() {
        double averageMarks = calculateAverageMarks();

        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "C";
        } else if (averageMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and performance
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math Marks: " + marksMath);
        System.out.println("Science Marks: " + marksScience);
        System.out.println("English Marks: " + marksEnglish);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Grade: " + determineGrade());
    }
}
public class StudentGradingSystem {
    public static void main(String[] args){
        Student student = new Student("Alice Smith", "R001", 85, 90, 80);

        // Displaying student details and performance
        student.displayStudentDetails();
    }
}
