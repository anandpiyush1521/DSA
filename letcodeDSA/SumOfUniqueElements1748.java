import java.util.*;
public class SumOfUniqueElements1748{
    public static int sumOfUnique(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    sum = sum + nums[i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}