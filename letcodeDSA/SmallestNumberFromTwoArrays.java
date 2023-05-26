import java.util.*;
public class SmallestNumberFromTwoArrays{
    public static int minNumber(int[] nums1, int[] nums2) {
        int temp = getCommon(nums1, nums2);
        if(temp > 0) return temp;
        int a = getMinimum(nums1);
        if(isPresent(nums2, a)){
            return a;
        }
        int b = getMinimum(nums2);
        if(a < b){
            return a*10+b;
        }else{
            return b*10+a;
        }
    }
    public static int getMinimum(int[] nums){
        int min = Integer.MAX_VALUE;
        int ans;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            ans = min;
        }
        return min;
    }
    public static boolean isPresent(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k) return true;
        }
        return false;
    }
    public static int getCommon(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        int ans=-1;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            min = Math.min(min, list.get(i));
            ans = min;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums1 = {7,5,6};
        int[] nums2 = {1,4};
        System.out.println(minNumber(nums1, nums2));
    }
}