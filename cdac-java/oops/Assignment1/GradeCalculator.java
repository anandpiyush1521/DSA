import java.util.Scanner;
public class GradeCalculator {
    public static char calculateGrade(double average) {
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numOfGrades = scanner.nextInt();
        
        double total = 0;

        for (int i = 1; i <= numOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }
        double average = total / numOfGrades;
        char letterGrade = calculateGrade(average);

        System.out.println("Average grade: " + average);
        System.out.println("Corresponding letter grade: " + letterGrade);
        scanner.close();
    }
}
