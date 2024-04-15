import java.util.Scanner;

public class PasswordGenerator {

    static String generatePassword(int number, String name) {
        // Check if name consists of only lowercase letters
        if (name.matches("^[a-z]+$")) {
            // Convert number to absolute value to handle negative numbers
            int absNumber = Math.abs(number);

            // Ensure length of name is within the specified range
            int nameLength = Math.min(Math.max(name.length(), 1), 100);

            // Generate password using a combination of number and name
            return absNumber + name.substring(0, nameLength);
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        try {
            // Input: Number of test cases
            Scanner scanner = new Scanner(System.in);
            int T = Integer.parseInt(scanner.nextLine());

            // Process each test case
            for (int i = 0; i < T; i++) {
                // Input: Number and Name separated by space
                String[] testInput = scanner.nextLine().split(" ");

                if (testInput.length == 2) {
                    int number = Integer.parseInt(testInput[0]);
                    String name = testInput[1];

                    // Output: Print the password for each test case in a new line
                    String result = generatePassword(number, name);
                    System.out.println(result);
                } else {
                    System.out.println("Invalid input format");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
