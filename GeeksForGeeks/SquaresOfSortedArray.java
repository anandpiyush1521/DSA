import java.util.*;
public class SquaresOfSortedArray{
    public static void sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}