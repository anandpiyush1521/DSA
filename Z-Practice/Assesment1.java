import java.util.*;
public class Assesment1{
    public static int findKey(int input1, int input2, int input3){
        // List<Integer> list = Arrays.asList(input1, input2, input3);
        // int maxsSum=0;
        // int smallSum=0;
        // for(int i=0; i<list.size(); i++){
        //     maxsSum += largest(list.get(i));
        //     smallSum += smallest(list.get(i));
        // }
        // return maxsSum+smallSum;
        int a = thDigit(input1);
        int b = hunDigit(input2);
        int c = smallest(input3);

        return (a*b)+1;
    }
    // public int largest(int num){
    //     int max = Integer.MIN_VALUE;
    //     while(num > 0){
    //         int digit = num%10;
    //         max = Math.max(max, digit);
    //         num = num/10;
    //     }
    //     return max;
    // }
    // public int smallest(int num){
    //     int min = Integer.MAX_VALUE;
    //     while(num > 0){
    //         int digit = num%10;
    //         min = Math.min(min, digit);
    //         num = num/10;
    //     }
    //     return min;
    // }
    public static int thDigit(int num){
        return num/1000;
    }
    // public static int hunDigit(int num){
    //     return (num/100)%10;
    // }
    public static int tenDigit(int num){
        return (num/10)%10;
    }
    public static int smallest(int num){
        int min = Integer.MAX_VALUE;
        int nums = num;
        while(nums > 0){
            int digit = nums%10;
            min = Math.min(min, digit);
            nums = nums/10;
        }
        return min;
    }
    // public static int greatest(int num){
    //     int max = Integer.MIN_VALUE;
    //     int nums = num;
    //     while(nums > 0){
    //         int digit = nums%10;
    //         if(digit > max){
    //             max = digit;
    //         }
    //         nums = nums/10;
    //     }
    //     return max;
    // }
    public static void main(String[] args){
        int x = 3521;
        int b = 2455;
        int c = 1352;

        System.out.println(findKey(x, b, c));

    }
}