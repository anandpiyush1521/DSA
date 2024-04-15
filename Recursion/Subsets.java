import java.util.*;
public class Subsets{
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsets(nums);

        System.out.println(ans);
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(ans, new ArrayList<>(), nums, 0);

        return ans;
    }
    public static void backtracking(List<List<Integer>> ans, List<Integer> temp, int[] nums, int index){
        ans.add(new ArrayList<>(temp));

        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            backtracking(ans, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}