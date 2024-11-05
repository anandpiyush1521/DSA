public class BasicCalculator {
    public static void arithmeticOperations(int num1, int num2) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (num2 != 0) ? (double) num1 / num2 : Double.NaN; 

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        // Perform and display the operations
        arithmeticOperations(num1, num2);
    }
}
