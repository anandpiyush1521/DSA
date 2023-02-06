import java.util.*;
public class ShuffleTheArray1470{
    public static int[] shuffle(int[] nums, int n) {
        // int[] nums1 = new int[n];
        // int[] nums2 = new int[n];
        // int[] ans = new int[nums.length];
        // for(int i=0; i<n; i++){
        //     nums1[i] = nums[i];
        // }
        // for(int i=n, j=0; i<nums.length; i++, j++){
        //     nums2[j] = nums[i];
        // }
        // int[] shuffled = new int[nums1.length * 2];

        // for (int i = 0, j = 0; i < nums1.length; i++, j += 2) {
        //     shuffled[j] = nums1[i];
        //     shuffled[j + 1] = nums2[i];
        // }
        // return shuffled;

        int[] res = new int[2*n];
        for(int i=0; i<2*n; i++){
            if(i%2 == 0){
                res[i] = nums[i/2];
            }else{
                res[i] = nums[n + i/2];
            }
        }
        return res;
        
    }
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(shuffle(nums, n));
    }
}