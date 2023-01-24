import java.util.*;

class MaximalScoreAfterApplyingKOperations6258 {
    public int maxScore(int[] nums, int k) {
        PriorityQueue<Integer> pqu = new PriorityQueue<Integer>(
            (a, b) -> Integer.compare(b, a)
        );
        for(int num : nums) {
            pqu.add(num);
        }
        long sum = 0;
        while(k-- > 0){
            int n = pqu.poll();
            sum = sum + n;
            pqu.add((int) (Math.ceil((double)n/3)));
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 10, 3, 3, 3};
        int k = 3;
        MaximalScoreAfterApplyingKOperations6258 solution = new MaximalScoreAfterApplyingKOperations6258();
        int result = solution.maxScore(nums, k);
        System.out.println(result);
    }
}
