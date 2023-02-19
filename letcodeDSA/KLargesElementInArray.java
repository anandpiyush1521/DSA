import java.util.*;
public class KLargesElementInArray{
    public static int findKthLargest(int[] nums, int k){
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=nums.length-1; i>=0; i--){
            list.add(nums[i]);
        }

        int ans = list.get(k-1);

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
}