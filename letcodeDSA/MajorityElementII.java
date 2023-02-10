import java.util.*;
public class MajorityElementII{
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i) > nums.length/3){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}