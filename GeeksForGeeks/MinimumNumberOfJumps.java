import java.util.*;
public class MinimumNumberOfJumps{
    public static int minJumps(int[] arr){
        // your code here
        // int start = 0;
        // int end = arr.length-1;
        // return minimumJumps(arr, start, end);
        if(arr.length <= 1) return 0;
        if(arr[0] >= arr.length-1) return 1;
        if(arr[0] == 0) return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump=1;
        for(int i=1; i<arr.length; i++){
            if(i == arr.length-1) return jump;

            if(arr[i] >= (arr.length-1) -i) return jump+1;

            maxReach = Math.max(maxReach, i+arr[i]);
            step--;
            if(step == 0){
                jump++;
                if(i > maxReach){
                    return -1;
                }
                step = maxReach - i;
            }
        }
        return -1;
    }
    // public static int minimumJumps(int[] arr, int start, int end){
    //     if(start == end) return 0;

    //     if(arr[start] == 0) return Integer.MAX_VALUE;

    //     int min = Integer.MAX_VALUE;
    //     for(int i=start+1; i<=end && i<=start+arr[start]; i++){
    //         int jumps = minimumJumps(arr, i, end);
    //         if(jumps!=Integer.MAX_VALUE && jumps+1<min){
    //             min = jumps+1;
    //         }
    //     }
    //     return min;
    // }
    public static void main(String[] args){
        int arr[] = {1,3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));        
    }
}