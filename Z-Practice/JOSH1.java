import java.util.*;
public class JOSH1{
    public static int[] squareArray(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = n-1;
        int[] res = new int[n];
        while(left <= right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare < rightSquare){
                res[index] = rightSquare;
                right--;
            }else{
                res[index] = leftSquare;
                left++;
            }
            index--;
        }
        return res;
    }
    public static int[] sortedArray(int[] nums){
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n-1;
        int index=0;

        while(left <= right){
            if(nums[left] < nums[right]){
                res[index] = nums[left];
                left++;
            }else{
                res[index] = nums[right];
                right--;
            }
            index++;
        }
        return res;
    }
    public static void main(String[] args){
        // int[] nums = {-7, -5, -2, 0, 1};
        // int[] res = squareArray(nums);

        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i] + " ");
        // }

        int[] arr = {9, 4, 6, 1, 0, 8, 3};
        int[] ans = sortedArray(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}