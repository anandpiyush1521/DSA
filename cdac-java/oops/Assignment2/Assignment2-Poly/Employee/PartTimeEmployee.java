import java.util.*;
public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    //constructor
    public PartTimeEmployee(String employeeId, String employeeName, double salary, double hoursWorked, double hourlyRate){
        super(employeeId, employeeName, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getTotalCompensation(){
        return (hoursWorked * hourlyRate);
    } 
    
}
