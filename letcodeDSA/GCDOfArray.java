import java.util.*;
public class GCDOfArray{
    public static int findGCD(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return gcd(min, max);
    }
    public static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args){
        int[] arr = {7,5,6,8,3};
        System.out.println(findGCD(arr));
    }
}