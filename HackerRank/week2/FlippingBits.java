import java.util.*;
public class FlippingBits{
    public static long flippingBits(long n){
        String binary = getBinary(n);
        String temp = "";
        for(int i=0; i<binary.length(); i++){
            Character c = binary.charAt(i);
            if(c.toString().equals("1")){
                temp = temp + "0";
            }else{
                temp = temp + "1";
            }
        }
        return Long.parseUnsignedLong(temp, 2);
    } 
    public static String getBinary(long n) {   
        String result = Long.toBinaryString(n);
        return String.format("%32s", result).replaceAll(" ", "0");
    }
    public static void main(String[] args){
        long n = 2147483647;
        System.out.println(flippingBits(n));
    }
}