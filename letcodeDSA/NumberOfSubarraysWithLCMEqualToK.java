/* Given an integer array nums and an integer k, return the number of subarrays of nums where the least common multiple of the subarray's elements is k.
A subarray is a contiguous non-empty sequence of elements within an array.
The least common multiple of an array is the smallest positive integer that is divisible by all the array elements.

Example 1:
Input: nums = [3,6,2,7,1], k = 6
Output: 4
Explanation: The subarrays of nums where 6 is the least common multiple of all the subarray's elements are:
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]

Example 2:
Input: nums = [3], k = 2
Output: 0
Explanation: There are no subarrays of nums where 2 is the least common multiple of all the subarray's elements.     */

import java.util.*;
public class NumberOfSubarraysWithLCMEqualToK{
    public static int subarrayLCM(int[] nums, int k){
        int ans=0;
        for(int i=0; i<nums.length; i++){
            int runningLcm = nums[i];
            for(int j=i; j<nums.length; j++){
                runningLcm = lcm(runningLcm, nums[j]);
                if(runningLcm > k) break;

                if(runningLcm == k) ans++;
            }
        }
        return ans;
    }
    public static int lcm(int a, int b){
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        int lcm = (a*b)/gcd;

        return lcm;
    }
    public static void main(String[] args){
        int[] nums = {3,6,2,7,1};
        int k =6;

        System.out.println(subarrayLCM(nums,k));
    }
}

//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/palindrome-swapping-37143cf3/