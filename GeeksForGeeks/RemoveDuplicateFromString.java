import java.util.*;
public class RemoveDuplicateFromString{
    public static String removeDuplicates(String str){
        String res = "";
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!set.contains(String.valueOf(c))){
                set.add(String.valueOf(c));
                res = res + c;
            }
        }
        return res;
    }
    public static void main(String[] args){
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str));
    }
}