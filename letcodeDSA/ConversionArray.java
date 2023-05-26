import java.util.*;
public class ConversionArray{
    public static long[] findPrefixScore(int[] nums){
        int n = nums.length;
        long[] ans = new long[n];
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int temp = Math.max(maxNum, nums[i]); 
            int res = nums[i] + temp;
            ans[i] = res;
            maxNum = temp;
        }
        return conversionArray(ans);
    }
    public static long[] conversionArray(long[] ans){
        long[] ans2 = new long[ans.length];
        ans2[0] = ans[0];
        long temp = ans[0];
        for(int i = 1; i < ans.length; i++){
            temp = temp + ans[i];
            ans2[i] = temp;
        }
        return ans2;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,4,8,16};
        System.out.println(findPrefixScore(nums));

        //4 6 14 12 20
    }
}