import java.util.*;
public class IntersectionOfTwoArraysII{
    public static void intersect(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums2){
            if(set1.contains(num)) {
                set2.add(num);
                set1.remove(num);
            }
        }
        int[] res = new int[set2.size()];
        int index=0;
        for(Integer num: set2){
            res[index++] = num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersect(nums1, nums2);
    }
}