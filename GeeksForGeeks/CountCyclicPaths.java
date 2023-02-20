import java.util.*;
public class CountCyclicPaths{
    public static int countPaths(int N){

        if (N == 0) {
            return 1;
        }        
        // Initialize variables
        long[][] dp = new long[N + 1][4];
        long mod = 1000000007;
        // Initial values
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[0][2] = 0;
        dp[0][3] = 0;
        // DP calculation
        for (int i = 1; i <= N; i++) {
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2] + dp[i - 1][3]) % mod;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][3]) % mod;
            dp[i][3] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
        }
        return (int)dp[N][0];
    }
    public static void main(String[] args){
        int n = 2;
        System.out.println(countPaths(n));
    }   
}