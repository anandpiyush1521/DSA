/* There is a row of N walls in Geeksland. The king of Geeksland ordered Alexa to color all the walls on the occasion of New Year. Alexa can color each wall with either pink, black, or yellow. The cost associated with coloring each wall with a particular color is represented by a 2D array colors of size N*3 , where colors[i][0], colors[i][1], and colors[i][2] is the cost of painting ith wall with colors pink, black, and yellow respectively.
You need to find the minimum cost to color all the walls such that no two adjacent walls have the same color.

Example 1:
Input:
N = 3
colors[][] = {{14, 2, 11},
             {11, 14, 5},
             {14, 3, 10}}
Output:
10
Explanation:
Color wall 0 with black. Cost = 2. 
Color wall 1 with yellow. Cost = 5. 
Color wall 2 with black. Cost = 3.
Total Cost = 2 + 5 + 3 = 10              */


import java.util.*;
public class WallsColoring{
    public static int minCost(int [][] colors, int N){
        int[][] dp = new int[N+1][3];
        
        for(int i=1; i<=N; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+colors[i-1][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+colors[i-1][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][0])+colors[i-1][2];
        }
        
        return Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2]));
    }
    public static void main(String[] args){
        int colors[][] = {{14, 2, 11},{11, 14, 5},{14, 3, 10}};
        int n = 3;
        System.out.println(minCost(colors, n));
    }
}