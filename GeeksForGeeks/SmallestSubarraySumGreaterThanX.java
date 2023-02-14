/* Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.
Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).

Example 1:
Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation: Minimum length subarray is {4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
x  = 9
Output: 1
Explanation: Minimum length subarray is {10}                */


import java.util.*;
public class SmallestSubarraySumGreaterThanX{
    public static int smallestSubWithSum(int a[], int n, int x){
        // int len=n+1;
        // for(int i=0; i<n; i++){
        //     int currSum = a[i];
        //     if(currSum > x) return 1;
            
        //     for(int j=i+1; j<n; j++){
        //         currSum += a[j];
        //         if(currSum>x && (j-i+1)<len){
        //             len = j-i+1;
        //         }
        //     }
        // }
        // return len;
        int len = n+1;
        int currSum = 0;
        int start = 0, end = 0;
        while(end < n){
            while(currSum <= x && end < n){
                currSum += a[end++];
            }      
            while(currSum > x && start < n){
                if(end - start < len){
                    len = end - start;
                }
                currSum -= a[start++];
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] a = {1, 4, 45, 6, 0, 19};
        int n = a.length;
        int x = 51;
        System.out.println(smallestSubWithSum(a, x, n));
    }
}