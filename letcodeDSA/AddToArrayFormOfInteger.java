import java.util.*;
public class AddToArrayFormOfInteger{
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> result = new ArrayList<Integer>();
        for(int i= num.length-1; i>=0; i--){
            result.add(0, (num[i] + k)%10);
            k = (num[i] + k)/10;
        }
        while(k > 0){
            result.add(0, k%10);
            k = k/10;
        }
        return result;
    }
    // public static List<Integer> addToArrayForm(int[] num, int k){
    //     int resNum = 0;
    //     for(int i=0; i<num.length; i++){
    //         resNum  = resNum*10 + num[i];
    //     }
    //     int ans = resNum + k;
    //     int length = countNumber(ans);
    //     int[] arr = new int[length];
    //     for(int i=length-1; i>=0; i--){
    //         arr[i] = ans%10;
    //         ans = ans/10;
    //     }
    //     List<Integer> result = new ArrayList<Integer>(arr.length);
    //     for(int i: arr){
    //         result.add(i);
    //     }
    //     return result;
    // }
    // public static int countNumber(int num){
    //     int count=0;
    //     while(num != 0){
    //         num = num/10;
    //         count++;
    //     }
    //     return count;
    // }
    public static void main(String[] args){
        int[] num = {1,2,0,0};
        int k =34;
        System.out.println(addToArrayForm(num, k));
    }
}