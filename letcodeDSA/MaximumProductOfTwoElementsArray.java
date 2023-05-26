import java.util.*;
public class MaximumProductOfTwoElementsArray{
    public static int maxProduct(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        for(int num: nums){
            pq.add(num);
        }
        return (pq.poll()-1)*(pq.poll()-1);
    }
    public static void main(String[] args){
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
}