import java.util.*;
public class ArraySplitLargestSum{
    public static int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        int max=0;
        int sum=0;
        for(int val:nums){
            sum+=val;
            max = Math.max(max,val);
        }
        int low = max, high = sum, ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(nums,mid,k) == true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }return ans;
 
     }
    public static boolean isPossible(int[] nums, int mid, int k){
        int ct=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                ct++;
                sum = nums[i];
            }
        }return ct<=k;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}