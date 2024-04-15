import java.util.Scanner;

public class Ccountxxx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        int result = countRepeatingSubstrings(S);
        System.out.println(result);
    }

    public static int countRepeatingSubstrings(String S) {
        int count = 0;
        int currentCount = 1;

        for (int i = 1; i < S.length(); i++){
            if (S.charAt(i) == S.charAt(i - 1)){
                currentCount++;
            } else {
                count += currentCount - 1; 
                currentCount = 1;
            }
        }
        count += currentCount - 1; 
        return count;
    }
}
