import java.util.*;
public class SubstringsofSizeThreewithDistinctCharacters1876{
    public static int countGoodsubstring(String s){
        int len = s.length();
        int count = 0;
        for(int i=0; i<len-2; i++){
            String subStr = s.substring(i, i+3);
            if(isGoodsubstring(subStr)){
                count++;
            }
        }
        return count;
    }
    public static boolean isGoodsubstring(String s){
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }else{
                set.add(ch);
            }
        }
        return true;
    }
    public static void main(String[] args){
        // String s = "xyzzaz";
        String s = "aababcabc";
        System.out.println(countGoodsubstring(s));
    }
}