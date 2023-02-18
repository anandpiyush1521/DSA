/* A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point, the task is to find the minimum element in it.

Example 1
Input:
N = 5
arr[] = {4 ,5 ,1 ,2 ,3}
Output: 1
Explanation: 1 is the minimum element inthe array.

Example 2
Input:
N = 7
arr[] = {10, 20, 30, 40, 50, 5, 7}
Output: 5
Explanation: Here 5 is the minimum element            */

import java.util.*;
public class MinimumElementInSortedAndRotatedArray{
    public static int findMin(int arr[], int n){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = Math.min(arr[i], min);
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {4 ,5 ,1 ,2 ,3};
        int n = 5;
        System.out.println(findMin(arr, n));
    }
}