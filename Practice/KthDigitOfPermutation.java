import java.util.ArrayList;
import java.util.List;

public class KthDigitOfPermutation {

    public static int KthDigitOfIPermutation(int n, int k, int i) {
        String ithPerm = findIthPerm(n, i);
        return Character.getNumericValue(ithPerm.charAt(k - 1));
    }

    public static String findIthPerm(int n, int i) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 1; j <= n; j++) {
            numbers.add(j);
        }

        StringBuilder result = new StringBuilder();
        int[] factorial = new int[n];
        factorial[0] = 1;

        for (int j = 1; j < n; j++) {
            factorial[j] = factorial[j - 1] * j;
        }

        i--; 

        for (int j = n - 1; j >= 0; j--) {
            int index = i / factorial[j];
            result.append(numbers.get(index));
            numbers.remove(index);
            i -= index * factorial[j];
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int i = 3;

        int result = KthDigitOfIPermutation(n, k, i);
        System.out.println("The " + k + "th digit of the " + i + "th permutation is: " + result);
    }
}
