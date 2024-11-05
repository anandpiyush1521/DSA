public class MaximumValueFinder {
    public static int findMaximum(int num1, int num2, int num3) {

        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 25;
        int number3 = 15;

        int maxValue = findMaximum(number1, number2, number3);
        System.out.println("The maximum value among " + number1 + ", " + number2 + ", and " + number3 + " is: " + maxValue);
    }
}
