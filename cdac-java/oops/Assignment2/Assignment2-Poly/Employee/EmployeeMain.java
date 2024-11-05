public class EmployeeMain{
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("S4569", "Nisha Singh", 1000000, 14569);

        System.out.println("The total annual compensation of full time employee is: " + fullTimeEmployee.getTotalCompensation());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("S4789", "Ravi Verma", 45978, 13, 100);

        System.out.println("The total annual compensation of full time employee is: " + partTimeEmployee.getTotalCompensation());

    }
}