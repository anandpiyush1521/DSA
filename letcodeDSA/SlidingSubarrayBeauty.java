import java.util.*;
public class SlidingSubarrayBeauty {
    public static void getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int j=k;
        while(j <= n){
            List<Integer> list = new ArrayList<>();
            int i;
            for(i=j-k; i<j; i++){
                list.add(nums[i]);
            }
            res[j-k]= minimum(list, x);
            j++;
        }
        for(int q=0; q<res.length; q++){
            System.out.print(res[q] + " ");
        }
    }
    public static int minimum(List<Integer> list, int x){
        Collections.sort(list);
        if(list.get(x-1) > 0){
            return 0;
        }else{
            return list.get(x-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {-3,1,2,-3,0,-3};
        int k=2;
        int x=1;

        getSubarrayBeauty(nums, k, x);
    }
}