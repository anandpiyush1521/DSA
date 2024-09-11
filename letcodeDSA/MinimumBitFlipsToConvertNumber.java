import java.util.*;

public class MinimumBitFlipsToConvertNumber {
    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        return countBits(xor);
    }

    private static int countBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();

        int mininmumBitFlips = minBitFlips(start, goal);

        System.out.println("mininmum bit flips: "+mininmumBitFlips);
    }
}