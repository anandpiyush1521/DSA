import java.util.*;
public class FindFirstAndLastPositionOfElement{
    public static void searchRange(int[] nums, int target){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        if(list.contains(target)){
            int n = list.indexOf(target);
            res.add(n);
        }
        int[] arr = new int[res.size()];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        // int[] arr = new int[list.size()];
        // for(int i=0; i<list.size(); i++){
        //     arr[i] = list.get(i);
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target =8;
        //System.out.println(searchRange(nums, target));
        searchRange(nums, target);
    }
}