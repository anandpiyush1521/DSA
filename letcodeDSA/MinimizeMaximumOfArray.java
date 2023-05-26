/*You are given a 0-indexed array nums comprising of n non-negative integers.
In one operation, you must:
Choose an integer i such that 1 <= i < n and nums[i] > 0.
Decrease nums[i] by 1.
Increase nums[i - 1] by 1.
Return the minimum possible value of the maximum integer of nums after performing any number of operations.

Example 1:
Input: nums = [3,7,1,6]
Output: 5
Explanation:
One set of optimal operations is as follows:
1. Choose i = 1, and nums becomes [4,6,1,6].
2. Choose i = 3, and nums becomes [4,6,2,5].
3. Choose i = 1, and nums becomes [5,5,2,5].
The maximum integer of nums is 5. It can be shown that the maximum number cannot be less than 5. Therefore, we return 5.

Example 2:
Input: nums = [10,1]
Output: 10
Explanation: It is optimal to leave nums as is, and since 10 is the maximum value, we return 10.    */


import java.util.*;
public class MinimizeMaximumOfArray{
    public static int minimizeArrayValue(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=1; i<n; i++){
            int maxVal = maxValueInArray(nums);
            int index = findIndex(nums, maxVal);
            if(nums[index] > nums[index-1]){
                nums[index]--;
                nums[index - 1]++;
            }else{
                maxVal = Math.max(maxVal, nums[index]);
            }
            ans = maxValueInArray(nums);
        }
        return ans;
    }
    public static int maxValueInArray(int[] nums){
        int maxVal = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i ++){
            maxVal = Math.max(maxVal, nums[i]);
        }
        return maxVal;
    }
    public static int findIndex(int[] nums, int target) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            if(target == nums[i]){
                ans = i;
            }
        }
        return ans;
    }
    // public static int minimizeArrayValue(int[] nums){
    //     int n = nums.length;
    //     int maxVal = nums[0];
    //     for(int i=1; i<n; i++){
    //         if(nums[i] > nums[i-1]){
    //             nums[i-1]++;
    //             nums[i]--;
    //         }else{
    //             maxVal = Math.max(maxVal, nums[i]);
    //         }
    //     }
    //     return Math.max(maxVal, nums[n-1]);
    // }
    public static void main(String[] args){
        int[] nums = {3,7,5,6};
        System.out.println(minimizeArrayValue(nums));
    }
}