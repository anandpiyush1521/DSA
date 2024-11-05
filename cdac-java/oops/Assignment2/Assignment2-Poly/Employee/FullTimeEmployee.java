import java.util.*;
public class FullTimeEmployee extends Employee{
    private double annualBonus;

    public FullTimeEmployee(String employeeId, String employeeName, double basicSalary, double annualBonus){
        super(employeeId, employeeName, basicSalary);
        this.annualBonus = annualBonus;
    }

    @Override
    public double getTotalCompensation() {
        return basicSalary+annualBonus;
    }
}
