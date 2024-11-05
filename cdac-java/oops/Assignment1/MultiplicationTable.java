public class MultiplicationTable {
    public static void printMultiplicationTable(int num) {
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        int number = 7;
        printMultiplicationTable(number);
    }
}
