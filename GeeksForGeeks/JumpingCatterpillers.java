import java.util.*;
public class JumpingCatterpillers{
    public static long uneatenLeaves(long arr[], int n,int k)
    {
        // Your code goes here
        long count=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<k; j++){
                if(i % arr[j] == 0){
                    count++;
                    break;
                }
            }
        }
        return (long)n - count;
    }
    public static void main(String[] args){
        long[] arr = {2, 3, 5};
        int N = 10;
        int k = 3; 
        System.out.println(uneatenLeaves(arr, N, k));
    }
}