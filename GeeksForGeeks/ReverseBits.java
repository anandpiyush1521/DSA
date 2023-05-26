import java.util.*;
public class ReverseBits{
    static Long reversedBits(Long X){
        String temp = toBinary(X);
        StringBuilder sb = new StringBuilder();
        for(int i=temp.length()-1; i>=0; i--){
            sb.append(temp.charAt(i));
        }
        // System.out.println(sb.toString());
        String res = sb.toString();
        // System.out.println(Long.parseLong(res, 2));
        return Long.parseLong(res, 2);
    }
    static String toBinary(long x){
        StringBuilder sb = new StringBuilder();
        for(int i=31; i>=0; i--){
            int mask = 1 << i;
            sb.append((x & mask) != 0 ? 1 : 0);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        long x = 1;
        // System.out.println(toBinary(x));
        System.out.println(reversedBits(x));
    }
}