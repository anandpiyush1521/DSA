/* Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].

Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Example 2:
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1             */


import java.util.*;
public class ReversePairs{
    public static int reversePairs(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        return mergeSort(nums, 0, nums.length-1);
    }
    public static int mergeSort(int[] arr, int left, int right){
        if(right <= left){
            return 0;
        }
        int mid = left + (right - left)/2;
        // mergeSort(arr, left, mid);
        // mergeSort(arr, mid+1, right);
        
        int count= mergeSort(arr, left, mid) + mergeSort(arr, mid+1, right);
        for(int i = left, j=mid+1; i <= mid; i++){
            while (j <= right && arr[i] / 2.0 > arr[j]){ 
                j++;
            }
            count += j - (mid + 1);
        }
        Arrays.sort(arr, left, right+1);

        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }
}