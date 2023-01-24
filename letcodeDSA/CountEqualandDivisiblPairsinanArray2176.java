import java.util.*;
public class CountEqualandDivisiblPairsinanArray2176{
    public static int countPairs(int[] nums, int k){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(i, nums[i]);
        }
        int count=0;
        for(int data: nums){
            if(list.contains(data)){
                if(data % k == 0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums, k));
    }
}