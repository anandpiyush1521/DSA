/* Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value). The third distinct maximum is 1. */

import java.util.*;
public class ThirdLargestElement{
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        if(nums.length < 3) return nums[n-1];
       
        Set<Integer> set = new HashSet<>();
        for(int i=nums.length-1; i>=0; i--){
            set.add(nums[i]);
        }
        // List<Integer> list = new ArrayList<>(set);
        // Collections.reverse(list);
        // int[] res = new int[list.size()];
        // int index = 0;
        // for(Integer num: list) {
        //     res[index++] = num;
        // }
        // if(res.length < 3) return res[0];

        // int ans = res[2];
        // return ans;
        if(set.size() < 3) return Collections.max(set);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num: set){
            pq.offer(num);
            if(pq.size() > 3){
                pq.poll();
            }
        }
        if(pq.size() == 2){
            pq.poll();
        }

        return pq.peek();
    }
    public static void main(String[] args){
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}