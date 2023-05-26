/* You are given a sorted array a of length n. For each i(0<=i<=n-1), you have to make all the elements of the array from index 0 till i equal, using minimum number of operations. In one operation you either increase or decrease the array element by 1.
You have to return a list which contains the minimum number of operations for each i, to accomplish the above task.
Note:
1. 0-based indexing.
2. For each index, you need to consider the same array which was given to you at the start.

Example 1:
Input:
N=4
A={1,6,9,12}
Output: 0 5 8 14
Explanation:
For i=0, We do not need to perform any operation, our array will be {1}->{1}. And minimum number of operations will be 0.
For i=1, We can choose to convert all the elements from 0<=j<=i to 4, our array will become {1,6}->{4,4}. And minimum number of operations will be |1-4|+|6-4|=5.
For i=2, We can choose to convert all the elements from 0<=j<=i to 6, our array will become {1,6,9}->{6,6,6} and the minimum number of operations will be |1-6|+|6-6|+|9-6|=8.
Similarly, for i=3, we can choose to convert all the elements to 8, {1,6,9,12}->{8,8,8,8}, and the minimum number of operations will be 14. */

import java.util.*;
public class OptimalArray{
    // public static long[] optimalArray(int n,int a[])
    public static void optimalArray(int n,int a[])
    {
        long[] res = new long[n];
        for(int i=0; i<n; i++){
            int median = 0;
            if((i+1)/2 != 0){
                median = a[i/2];
            }else{
                median = (a[i/2] + a[(i+1)/2])/2;
            }
            long temp=0;
            for(int j=0; j<=i; j++){
                temp += Math.abs(a[j] - median);
            }
            res[i] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(res[i]+ " ");
        }
    }
    // public static int findMedian(int[] arr){
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     if(n%2 != 0){
    //         return (int)arr[n/2];
    //     }else{
    //         return (int)(arr[(n-1) / 2] + arr[n/2]) / 2;
    //     }
    // }
    public static void main(String[] args){
        int[] A={1,6,9,12};
        int N = 4;
        optimalArray(N, A);
    }
}