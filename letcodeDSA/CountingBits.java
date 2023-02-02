import java.util.*;
public class CountingBits{
    public static int[] countBits(int n){
        int[] result = new int[n+1];
        if(n < 0) return new int[0];

        for(int i=1; i<=n; i++){
            if((i & 1 )== 0){
                result[i] = result[i/2];
            }else{
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(countBits(n));
    }
}