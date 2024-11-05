import java.util.*;
public class Employee {
    protected String employeeId;
    protected String employeeName;
    protected double basicSalary;

    public Employee(String employeeId, String employeeName, double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double getTotalCompensation() {
        return basicSalary;
    }
}
