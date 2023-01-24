import java.util.*;
public class AbsolutedifferencedivisiblebyK{
    public static long countPairs(int n, int[] arr, int k){
        if(n == 0) return 0;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if( (Math.abs(arr[i]) - Math.abs(arr[j]))%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {3, 7, 11};
        int n = 3;
        int k = 4;
        System.out.println(countPairs(n, arr, k));
    }
}