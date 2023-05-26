/* Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer. */

import java.util.*;
public class SingleNumberIII{
    public static void singleNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int num: nums){
            if(map.get(num) == 1) list.add(num);
        }
        int[] res = new int[list.size()];
        int index=0;
        for(Integer num: list){
            res[index++] = num;
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {0,1};
        singleNumber(nums);
    }
}

// https://leetcode.com/problems/single-number-iii/