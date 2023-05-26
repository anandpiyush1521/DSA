import java.util.*;
public class SelfDividingNumbers{
    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
            if(isSelfDivisible(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static boolean isSelfDivisible(int num){
        int originalNum = num;
        while(num > 0){
            int digit = num%10;
            if(digit==0 || originalNum%digit!=0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public static void main(String[] args){
        // int num = 16;
        // System.out.println(isSelfDivisible(num));
        int left = 1;
        int right=22;
        System.out.println(selfDividingNumbers(left, right));
    }
}