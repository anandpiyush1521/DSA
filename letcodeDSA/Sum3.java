import java.util.*;
public class Sum3{
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low = i+1;
            int high = n-1;
            while(low < high){
                if(nums[i]+nums[low]+nums[high] == 0){
                    result.add(Arrays.asList(nums[i]+nums[low]+nums[high]));
                    low++;
                    
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                }else if(nums[i]+nums[low]+nums[high] < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}