/* An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 

Example 1:
Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3. It is the peak element as it is greater than its neighbour 2. If 2 is returned then the generated output will be 1 else 0.

Example 2:
Input:
N = 2
arr[] = {3,4}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the peak element as it is greater than its only neighbour element 3. If 1 is returned then the generated output will be 1 else 0.                    */

import java.util.*;
public class PeakElement{
    public static int peakElement(int[] arr,int n){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = Math.max(max,arr[i]);
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int n = 3;
        int[] arr = {1,2,3};
        System.out.println(peakElement(arr,n));
    }
}