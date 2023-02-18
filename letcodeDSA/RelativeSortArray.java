/* Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Example 2:
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]                              */

import java.util.*;
public class RelativeSortArray{
    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int[] res = new int[arr1.length];
        int index=0;
        for(int nums: arr2){
            int frequency = map.getOrDefault(nums, 0);
            while(frequency-- > 0){
                res[index++] = nums;
            }
            map.remove(nums);
        }
        List<Integer> remList = new ArrayList<>(map.keySet());
        Collections.sort(remList);
        for(int num: remList){
            int freq = map.get(num);
            while(freq-- > 0){
                res[index++] = num;
            }
        } 
        return res;
    }
    public static void main(String[] args){
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(relativeSortArray(arr1, arr2));
    }
}