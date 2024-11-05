import java.util.*;
class Employee{
    //employeeID, name, designation, and salary
    private String employeeID;
    private String name;
    private String designation;
    private double salary;

    //constructor
    public Employee(String employeeID, String name, String designation, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    //getter and setter
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //increase salary method
    public void incrementSalary(double percentage) {
        if(percentage > 0){
            double increment = (salary * percentage)/100;
            salary += increment;
            System.out.println("Salary increased by " + percentage + "%. New salary: $" + salary);
        } else {
            System.out.println("Increase percentage must be greater than zero.");
        }
    }

    // Method to calculate annual bonus (e.g., 10% of the annual salary)
    public double calculateAnnualBonus(double bonusPercentage) {
        return (salary * 12) * (bonusPercentage / 100);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }

}
public class EmployeeManagement {
    public static void main(String[] args){
        Employee employee = new Employee("E123", "John Doe", "Software Engineer", 5000.0);

        // Displaying initial employee details
        employee.displayEmployeeDetails();

        // Increasing salary by 10%
        employee.incrementSalary(10);

        // Displaying employee details after salary increase
        System.out.println("\nAfter salary increase:");
        employee.displayEmployeeDetails();

        // Calculating and displaying annual bonus (assuming a 15% bonus)
        double bonus = employee.calculateAnnualBonus(15);
        System.out.println("\nAnnual Bonus (15%): $" + bonus);
    }
}
