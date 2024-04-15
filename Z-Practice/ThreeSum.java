import java.util.*;
public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        generateTriplet(0, nums, new ArrayList(), ans);
        // return ans;

        return getDistinctElement(ans);
    }
    public static void generateTriplet(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==3 && isSumZero(curr)){
            ans.add(new ArrayList(curr));
        }
        for(int i=index; i<nums.length; i++){
            curr.add(nums[i]); //[-1]
            generateTriplet(i+1, nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
    public static boolean isSumZero(List<Integer> list){
        if(list.size() == 0){
            return false;
        }
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum==0;
    }
    public static List<List<Integer>> getDistinctElement(List<List<Integer>> ans){
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> list : ans){
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);
            set.add(sortedList);
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
