import java.util.*;
public class PerfectNumber507{
    public static boolean checkPerfectNumber(int num){
        int res = sumOfDivisor(num);
        if(num == res) return true;

        return false;
    }
    public static int sumOfDivisor(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        // int num = 28;
        // System.out.println(sumOfDivisor(num));

        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }
}