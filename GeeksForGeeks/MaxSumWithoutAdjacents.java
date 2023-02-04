/* Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.

Example 1:
Input:
N = 6
Arr[] = {5, 5, 10, 100, 10, 5}
Output: 110
Explanation: If you take indices 0, 3 and 5, then Arr[0]+Arr[3]+Arr[5] = 5+100+5 = 110.         */                     

import java.util.*;
public class MaxSumWithoutAdjacents{
    public static int findMaxSum(int arr[], int n) {
        int temp = arr[0];
        int sum = 0;
        for(int i=1; i<n; i++){
            int temp1 = sum + arr[i];
            int sum1 = Math.max(temp, sum);
            
            temp = temp1;
            sum = sum1;
        }
        int resAns = Math.max(temp, sum);
        return resAns;
    }
    public static void main(String[] args){
        int[] arr = {5, 5, 10, 100, 10, 5};
        int n = 6;
        System.out.println(findMaxSum(arr, n));
    }
}