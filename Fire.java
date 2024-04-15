import java.util.*;
public class Fire{
    public static int findPin(int input1, int input2, int input3, int input4){
        int a=maxDigit(input1);
        int b = minDigit(input1);

        int c = maxDigit(input2);
        int d = minDigit(input2);

        int e = maxDigit(input3);
        int f = minDigit(input3);

        int ans = ((a*b) * (c*d) * (e*f)) - input4;

        return ans;
    }
    public int maxDigit(int num){
        int max = Integer.MIN_VALUE;
        while (num!= 0) {
            int digit = num%10;
            max = Math.max(max, digit);
            num = num/10;
        }
        return max;
    }
    public int minDigit(int num){
        int min = Integer.MAX_VALUE;
        while (num!= 0) {
            int digit = num%10;
            min = Math.min(min, digit);
            num = num/10;
        }
        return min;
    }
    public static void main(String[] args){
       int a = 3521;
       int b =  2452;
       int c = 1352;
       int d = 38;
        System.out.println(findPin(a, b, c, d));
    }
}