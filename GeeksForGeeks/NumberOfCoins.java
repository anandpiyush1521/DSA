import java.util.*;
public class NumberOfCoins{
    public static int minCoins(int coins[], int M, int V) 
	{ 
	    int[] dp = new int[V+1];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	    dp[0] = 0;
	    for(int i=1; i<=V; i++){
	        for(int j=0; j<M; j++){
	            if(coins[j] <= i){
	                int res = dp[i - coins[j]];
	                if(res != Integer.MAX_VALUE && res+1 < dp[i]){
	                    dp[i] = res+1;
	                }
	            }
	        }
	    }
	    if(dp[V] == Integer.MAX_VALUE){
	        return -1;
	    }else{
	        return dp[V];
	    }
	}
    public static void main(String[] args){
        int[] coins = {25, 10, 5};
        int v = 30;
        int m = 3;
        System.out.println(minCoins(coins, m, v));
    }
}