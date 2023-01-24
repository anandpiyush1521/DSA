import java.util.*;
public class NumberOfOneBits{
    public static void setBits(int N){
        System.out.println(Integer.toBinaryString(N));
        //int s = Integer.bitCount(N);
        // return s;
    }
    public static void main(String[] args){
        int n = 3;
        setBits(n);
    }
}