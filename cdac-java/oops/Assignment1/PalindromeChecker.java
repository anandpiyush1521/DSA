public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String normalizedStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = normalizedStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (normalizedStr.charAt(i) != normalizedStr.charAt(length - 1 - i)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "madam";
        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }
}
