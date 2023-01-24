import java.util.*;
public class FindTheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        if(trust.length < 1) return -1;
        int[] res = new int[n+1];
        for(int[] arr: trust){
            res[arr[0]]--;
            res[arr[1]]++;
        }
        int judge=-1;
        for(int i=1; i<=n; i++){
            if(res[i] == n-1){
                judge=i;
            }
        }
        return judge;
    }
    public static void main(String[] args){
        int n = 3;
        int[][]trust = {{1,3},{2,3}};
        System.out.println(findJudge(n,trust));
    }
}