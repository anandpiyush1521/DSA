import java.util.*;
public class FindFirstAndLastPositionOfElement{
    public static int[] searchRange(int[] nums, int target){
        int[] result = {-1, -1};
        int n = nums.length;
        int i;
        for(i=0; i<n; i++){
            if(nums[i] == target){
                result[0] = i;
                break;
            }
        }
        if(result[0] == -1) return result;
        while(i<n && nums[i]==target){
            i++;
        }
        result[1] = --i;
        return result;
        // List<Integer> list = new ArrayList<Integer>();
        // List<Integer> res = new ArrayList<Integer>();
        // for(int i=0; i<nums.length; i++){
        //     list.add(nums[i]);
        // }
        // if(list.contains(target)){
        //     int n = list.indexOf(target);
        //     res.add(n);
        // }
        // int[] arr = new int[res.size()];
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }
        
    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target =8;
        //System.out.println(searchRange(nums, target));
        searchRange(nums, target);
    }
}