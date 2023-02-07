/* Given an array arr[] consisting of n integers, find the length of the longest subarray with positive (non zero) product.

Example 1:
Input:
arr[] ={0, 1, -2, -3, -4} 
Output:
3
Explanation: 
The longest subarray with positive product is:  {1, -2, -3}.Therefore, the required length is 3.   */

import java.util.*;
public class LengthOfTheLongestSubarrayWithPositiveProduct{
    public static int maxLength(int arr[], int n){
        int firstNeg=-1, negCount=0;
        int start=0, ans=0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                start=i+1;
                firstNeg=-1;
                negCount=0;
                continue;
            }else if(arr[i]<0){
                negCount++;
                if(firstNeg == -1){
                    firstNeg = i;
                }
            }
            if(negCount%2 == 0){
                ans = Math.max(ans, i-start+1);
            }else{
                ans = Math.max(ans, i-firstNeg);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, -2, -3, -4};
        int n = 5;
        System.out.println(maxLength(arr, n));
    }
}