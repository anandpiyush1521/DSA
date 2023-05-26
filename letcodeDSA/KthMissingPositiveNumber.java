/* Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.  */

import java.util.*;
public class KthMissingPositiveNumber{
    public static int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: arr){
            set.add(num);
        }   
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=arr.length+k; i++) {
            if(!set.contains(i)){
                list.add(i);
            }
            if(list.size() == k) break;
        }
        return list.get(k-1);
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}

// https://leetcode.com/problems/kth-missing-positive-number/