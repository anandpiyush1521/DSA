/* You are given two 2D integer arrays nums1 and nums2.
nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.
Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays then its value in that array is considered to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.

Example 1:
Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.          */

import java.util.*;
public class MergeTwo2DArraysSummingValues{
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int[] num: nums1){
            map.put(num[0], num[1]);
        }
        for(int[] num: nums2){
            if(map.containsKey(num[0])){
                map.put(num[0],num[1]+map.get(num[0]));
            }else{
                map.put(num[0],num[1]);
            }
        }
        int[][] res = new int[map.size()][2];
        int index = 0;
        for(int key: map.keySet()){
            res[index++] = new int[]{key, map.get(key)};
        }
        Arrays.sort(res, (a, b) -> a[0] - b[0]);

        return res;
    }
    public static void main(String[] args){
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        System.out.println(mergeArrays(nums1, nums2));
    }
}