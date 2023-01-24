import java.util.*;
public class ReverseBitsOfNumber{
    public static int reverseBits(int n){
        //int bit = Integer.bitCount(n);
        int rev=0;
        int rem;
        while(n > 0){
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        return String.ValueOf(rev);
    }
    public static void main(String[] args){
        long n = 00000010100101000001111010011100;
        System.out.println(reverseBits(n));     
    }
}