import java.util.*;
public class  ArrayEqualPairsDivide{
    public static boolean divideArray(int[] nums) {
        int len = nums.length;
        if(len%2 != 0) return false;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: map.keySet()){
            int count = map.get(num);
            if(count%2 != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        //int[] nums = {3,2,3,2,2,2};
        int[] nums = {1,2,3,4};
        System.out.println(divideArray(nums));
    }
}