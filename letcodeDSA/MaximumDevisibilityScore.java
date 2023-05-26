import java.util.*;
public class MaximumDevisibilityScore{
    public static int maxDivScore(int[] nums, int[] divisors){
        int maxCount=0;
        int element= minIndex(divisors);
        for(int i=0; i<divisors.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] % divisors[i] == 0){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                element = divisors[i];
            }
            if(count == maxCount){
                maxCount = count;
                element = Math.min(element, divisors[i]);
            }
        }
        return element;
    }
    public static int minIndex(int[] nums){
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        // int[] nums = {73,13,20,6};
        // int[] divisors = {56,75,83,26,24,53,56,61};

        int[] nums = {31,91,47,6,37,62,72,42,85};
        int[] divisors = {95,10,8,43,21,63,26,45,23,69,16,99,92,5,97,69,33,44,8};

        // int[] nums = {20,14,21,10};
        // int[] divisors = {5,7,5};
        System.out.println(maxDivScore(nums, divisors));
    }
}