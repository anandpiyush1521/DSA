import java.util.*;
public class TribonacciNumber{
    public static int tribonacci(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        for(int i=3; i<n+1; i++){
            res[i] = res[i-1] + res[i-2] + res[i-3];
        }
        return res[n];
    } 
    public static void main(String[] args){
        int n = 4;
        System.out.println(tribonacci(n));
    }
}