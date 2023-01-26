import java.util.*;
public class FindAllDuplicatesInAnArray{
    public static List<Integer> findDuplicates(int[] nums){
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                set.add(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}