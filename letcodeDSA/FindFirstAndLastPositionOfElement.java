import java.util.*;
public class FindFirstAndLastPositionOfElement{
    public static void searchRange(int[] nums, int target){
        // int[] result = {-1, -1};
        // int n = nums.length;
        // int i;
        // for(i=0; i<n; i++){
        //     if(nums[i] == target){
        //         result[0] = i;
        //         break;
        //     }
        // }
        // if(result[0] == -1) return result;
        // while(i<n && nums[i]==target){
        //     i++;
        // }
        // result[1] = --i;
        // return result;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == target){
                res.add(i);
            } 
        }
        int[] arr = {-1, -1};
        for(int i=0; i<res.size(); i++){
            arr[i] = res.get(i);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target =6;
        //System.out.println(searchRange(nums, target));
        searchRange(nums, target);
    }
}