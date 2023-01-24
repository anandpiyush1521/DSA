import java.util.*;
public class GeeksAnaTheString{
    public static String removePair(String s){
        if(s.length() <= 1) return s;
        if(s.charAt(0) == s.charAt(1)){ 
            return removePair(s.substring(1));
        }else{
            return s.charAt(0) + removePair(s.substring(1));
        }
    }
    public static void main(String[] args){
        String s1 = "aaabbaaccd";
        System.out.println(removePair(s1));
    }
}