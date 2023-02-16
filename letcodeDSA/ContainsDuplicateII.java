import java.util.*;
public class ContainsDuplicateII{
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j] && Math.abs(i-j)<=k) return true;
        //     }
        // }
        // return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        int k =2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}