/* You are given an integer array nums of length n which represents a permutation of all the integers in the range [0, n - 1].
The number of global inversions is the number of the different pairs (i, j) where:
0 <= i < j < n
nums[i] > nums[j]
The number of local inversions is the number of indices i where:
0 <= i < n - 1
nums[i] > nums[i + 1]
Return true if the number of global inversions is equal to the number of local inversions.

Example 1:
Input: nums = [1,0,2]
Output: true
Explanation: There is 1 global inversion and 1 local inversion.

Example 2:
Input: nums = [1,2,0]
Output: false
Explanation: There are 2 global inversions and 1 local inversion.             */

import java.util.*;
public class GlobalAndLocalInversions{
    // public static boolean isIdealPermutation(int[] nums) {
    //     if(globalInversion(nums) == localInversion(nums)) return true;

    //     return false;
    // }
    // public static int globalInversion(int[] nums){
    //     int globalInversionCount = 0;
    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] > nums[j]){
    //                 globalInversionCount++;
    //             }
    //         }
    //     }
    //     return globalInversionCount;
    // }
    // public static int localInversion(int[] nums){
    //     int localInversionCount = 0;
    //     for(int i=0; i<nums.length-1; i++){
    //         if(nums[i] > nums[i+1]) localInversionCount++;
    //     }
    //     return localInversionCount;
    // }
    public static boolean isIdealPermutation(int[] nums) {
        if(nums.length == 0) return true;

        for(int i=0; i<nums.length; i++){
            if(Math.abs(nums[i] - i) > 1) return false;;
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums = {1,2,0};

        System.out.println(isIdealPermutation(nums));
    }
}