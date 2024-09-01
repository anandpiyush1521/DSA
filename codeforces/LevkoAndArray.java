/* 
 B. Levko and Array
 Levko has an array that consists of integers: a1, a2, ... , an. But he doesn’t like this array at all.

Levko thinks that the beauty of the array a directly depends on value c(a), which can be calculated by the formula:


The less value c(a) is, the more beautiful the array is.
It’s time to change the world and Levko is going to change his array for the better. To be exact, Levko wants to change the values of at most k array elements (it is allowed to replace the values by any integers). Of course, the changes should make the array as beautiful as possible.

Help Levko and calculate what minimum number c(a) he can reach.

Input
The first line contains two integers n and k (1 ≤ k ≤ n ≤ 2000). The second line contains space-separated integers a1, a2, ... , an ( - 109 ≤ ai ≤ 109).

Output
A single number — the minimum value of c(a) Levko can get.

Examples
Input                                                                                                                       Output
5 2                                                                                                                         
4 7 4 7 4                                                                                                                    0

*/

import java.util.*;

public class LevkoAndArray {
    // Maximum size of the array
    private static final int N = 2020; // 2000 + 20
    // Large number for comparison
    private static final int INF = Integer.MAX_VALUE / 2;
    // Array to store input elements
    private int[] a = new int[N];
    // Dynamic programming array
    private int[] dp = new int[N];
    // Number of elements and max changes allowed
    private int n, k;

    // Method to check if we can achieve a minimum beauty value with a given mid
    private boolean check(int x) {
        Arrays.fill(dp, 0, n, 0);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize dp[i] with the minimum possible sequence length
            for (int j = 0; j < i; j++) {
                // If the difference between a[i] and a[j] is within the allowed range
                if (Math.abs(a[i] - a[j]) <= x * (i - j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }

        // Check if the result is achievable with k changes
        return n - ans <= k;
    }

    // Main logic to find the minimum possible beauty value
    public int findMinBeauty(int[] array, int n, int k) {
        this.n = n;
        this.k = k;
        this.a = array;

        int low = -1;
        int high = INF;

        // Binary search to find the minimum possible beauty value
        while (high - low > 1) {
            int mid = (low + high) / 2;
            if (check(mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LevkoAndArray levko = new LevkoAndArray();

        // Input the number of elements and k
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Find and print the minimum possible beauty value
        int result = levko.findMinBeauty(array, n, k);
        System.out.println(result);
    }
}
