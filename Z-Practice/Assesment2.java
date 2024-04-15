import java.util.*;
public class Assesment2{
    // public static int findPassword(int input1, int input2, int input3, int input4, int input5){
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;
    //     List<Integer> inputsList = Arrays.asList(input1, input2, input3, input4, input5);

    //     for(int i=0; i<inputsList.size(); i++){
    //         if(isStable(inputsList.get(i))){
    //             max = Math.max(max, inputsList.get(i));
    //             min = Math.min(min, inputsList.get(i));
    //         }
    //     }
    //     return max-min;
    // }
    public static int findPassword(int input1, int input2, int input3, int input4, int input5){
        int sum=0;
        List<Integer> inputsList = Arrays.asList(input1, input2, input3, input4, input5);

        for(int i=0; i<inputsList.size(); i++){
            if(isStable(inputsList.get(i))){
                sum += inputsList.get(i);
            }
        }
        return sum;
    }
    public static boolean isStable(int nums){
        int num = Math.abs(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num > 0){
            int digit = num%10;
            map.put(digit, map.getOrDefault(digit, 0)+1);
            num = num/10;
        }
        int stableFreq = 0;
        boolean isStable = true;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            if(stableFreq == 0){
                stableFreq = freq;
            }else if(freq != stableFreq){
                isStable = false;
                break;
            }
        }
        return isStable;
    }
    public static void main(String[] args){
        int a = 12;
        int b = 1313;
        int c = 122;
        int d = 678;
        int e = 898;
        System.out.println(findPassword(a, b, c, d, e));
    }
}