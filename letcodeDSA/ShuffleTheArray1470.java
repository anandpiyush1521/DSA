import java.util.*;
public class ShuffleTheArray1470{
    public static int[] shuffle(int[] nums, int n) {
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for(int i=0; i<n; i++){
            nums1[i] = nums[i];
        }
        for(int i=n, j=0; i<nums.length; i++, j++){
            nums2[j] = nums[i];
        }
        return nums1;
    }
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(shuffle(nums, n));
    }
}