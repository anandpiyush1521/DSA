import java.util.*;
public class NectGreatestElemetnInArray{
    public static int[] nextGreatest(int[] arr){
        int[] nums = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int temp = maxElement(arr, i);
            nums[i] = temp;
        }
        return nums;
    }
    public static int maxElement(int[] arr, int i){
        int max = arr[i];
        // if(i+1 <= arr.length){
        //     max = arr[i];
        // }
        for(int j=i+1; j<arr.length; j++){
            max = Math.max(max, arr[j]);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {6, 7, 11, 4, 10, 8};
        int[] res = nextGreatest(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}