/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation: Max subarray sum is -1 of element (-1)       */

import java.util.*;
public class KadaneAlgorithm{
    public static long maxSubarraySum(int arr[], int n){
        long sum=Long.MIN_VALUE;
        long curSum = 0;
        for(int i=0; i<n; i++){
            curSum = curSum + arr[i];
            sum = Math.max(sum, curSum);
            if(curSum < 0){
                curSum = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,-2,5};
        int n = 5;
        System.out.println(maxSubarraySum(arr, n));
    }
}