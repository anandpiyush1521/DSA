import java.util.*;
public class PerfectSquares{
    public static int minSquares(int n){
        if(n<=3){
            return n;
        }
        int res = n;
        for(int i=1; i<=n; i++){
            int temp = i*i;
            if(temp > n){
                break;
            }else{
                res = Math.min(res, 1+minSquares(n - temp));
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n = 13;
        System.out.println(minSquares(n));
    }
}