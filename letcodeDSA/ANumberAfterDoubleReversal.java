import java.util.*;
public class ANumberAfterDoubleReversal{
    public static boolean isSameAfterReversals(int num){
        int reverse1 = reverseOfNumber(num);
        int reverse2 = reverseOfNumber(reverse1);
        if(reverse2 == num){
            return true;
        }else{
            return false;
        }
    }
    public static int reverseOfNumber(int num){
        int reverse=0;
        int rem;
        while(num > 0){
            rem = num%10;
            reverse = (reverse*10) + rem;
            num = num/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }
}