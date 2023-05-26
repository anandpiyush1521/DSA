import java.util.*;
public class SortAnArray_Rotate{
    //public static int[] sortArray(int[] nums)
    public static void sortArray(int[] nums){
        for(int i=1; i<nums.length; i++){
            int j=i;
            int a = nums[i];
            while(j>0 && nums[j-1]>a){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = a;
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {5,2,3,1};
        sortArray(nums);
    }
}