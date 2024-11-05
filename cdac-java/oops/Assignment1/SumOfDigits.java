public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);  

        while (number > 0) {
            int digit = number % 10;  
            sum += digit;             
            number /= 10;            
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + result);
    }
}
