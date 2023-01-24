import java.util.*;
public class RearrangeArray{
    public int[] rearrangeArray(int[] nums){
        int[] answer = new int[nums.length];
        int povindex = 0;
        int negindex = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                answer[povindex] = nums[i];
                povindex +=2;
            } else{
                answer[negindex] = nums[i];
                negindex +=2;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        RearrangeArray rearr = new RearrangeArray();
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(rearr(arr));
    }
}