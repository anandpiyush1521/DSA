import java.util.*;

public class MaximumAreaOfHistogram{
    // public static long findMin(long a, long b){
    //     long min;
    //     if(a > b){
    //         min = b;
    //     }else{
    //         min = a;
    //     }
    //     return min;
    // }
    // public static long findMax(long a, long b){
    //     long max;
    //     if(a > b){
    //         max = a;
    //     }else{
    //         max = b;
    //     }
    //     return max;
    // }
    public static long getMaxArea(long hist[], long n) {
        long maxArea = 0;
        for(long i = 0; i < n; i++){
            long temp = hist[(int)i];
            maxArea = Math.max(temp, maxArea);
            for(long j = i+1; j<n; j++){
                temp = Math.min(temp, hist[(int)j]);
                maxArea = Math.max(maxArea, temp*(j-i+1));
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        long arr[] = {6,2,5,4,5,1,6};
        long n = 7;
        System.out.println(getMaxArea(arr, n));
    }
}