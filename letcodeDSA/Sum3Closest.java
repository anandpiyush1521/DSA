import java.util.*;
public class Sum3Closest{
    public static int threeSumClosest(int[] nums, int target) {
        // Arrays.sort(nums);
        // int[] sums = new int[nums.length];
        // int sum=0;
        // for(int i=0; i<nums.length; i++){
        //     sum = sum + nums[i];
        //     sums[i] = sum;
        // }
        // return getClosest(sums, target);
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum) < Math.abs(target-closestSum)){
                    closestSum = sum;
                }
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
    // public static int getClosest(int[] nums, int target){
    //     int distance = Math.abs(nums[0] - target);
    //     int index =0;
    //     for(int i=1; i<nums.length; i++){
    //         int resDistance = Math.abs(nums[i] - target);
    //         if(resDistance < distance){
    //             index = i;
    //             distance = resDistance;
    //         }
    //     }
    //     return nums[index];
    // }
    public static void main(String[] args){
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }
}