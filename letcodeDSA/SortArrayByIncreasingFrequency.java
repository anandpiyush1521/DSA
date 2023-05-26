import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<Integer>(map.keySet());
        Collections.sort(result, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                int freqCompare = map.get(num1) - map.get(num2);
                if (freqCompare == 0) {
                    return num2 - num1; //descending order
                }
                return freqCompare;
            }
        });
        int[] res = new int[nums.length];
        int index = 0;
        for (int num : result) {
            int intCount = map.get(num);
            for (int j = 0; j < intCount; j++) {
                res[index++] = num;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};
        frequencySort(nums);
    }
}
