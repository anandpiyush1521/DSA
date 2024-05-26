import java.util.Scanner;
public class MinimizedOperations {
    public static int optimalBSTCost(int[] keys, int[] freq) {
        int n = keys.length;
        int[][] dp = new int[n][n];
        int[][] freqSum = new int[n][n];

        // Compute freqSum[i][j]
        for (int i = 0; i < n; i++) {
            freqSum[i][i] = freq[i];
            for (int j = i + 1; j < n; j++) {
                freqSum[i][j] = freqSum[i][j - 1] + freq[j];
            }
        }

        // Fill dp array
        for (int length = 1; length <= n; length++) {  // length of the range
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int r = i; r <= j; r++) {
                    int cost = (r == i ? 0 : dp[i][r - 1]) + (r == j ? 0 : dp[r + 1][j]);
                    dp[i][j] = Math.min(dp[i][j], cost + freqSum[i][j]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        int[] freq = new int[n];

        for(int i=0; i<n; i++){
            keys[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            freq[i] = sc.nextInt();
        }
        System.out.println("Cost of the Optimal BST: " + optimalBSTCost(keys, freq));
    }
}
