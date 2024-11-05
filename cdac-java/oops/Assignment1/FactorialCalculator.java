public class FactorialCalculator {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        long result = 1; 

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result; 
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
