/* An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1                                  */

import java.util.*;
public class PeakIndexInMountainArray{
    public static int peakIndexInMountainArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = Math.max(ans, arr[i]);
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}