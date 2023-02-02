import java.util.*;
public class DistinctColoring{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        long[][] ans = new long[N][3];
        ans[0][0] = r[0];
        ans[0][1] = g[0];
        ans[0][2] = g[0];
        
        for(int i=1; i<N; i++){
            ans[i][0]=Math.min(ans[i-1][1],ans[i-1][2])+r[i];
            ans[i][1]=Math.min(ans[i-1][0],ans[i-1][2])+g[i];
            ans[i][2]=Math.min(ans[i-1][0],ans[i-1][1])+b[i];
        }
        return Math.min(ans[N-1][0],Math.min(ans[N-1][1],ans[N-1][2]));
    }
    public static void main(String[] args){
        int N = 3;
        int r[] = {1, 1, 1};
        int g[] = {2, 2, 2};
        int b[] = {3, 3, 3};

        System.out.println(distinctColoring(N, r, g, b));
    }
}