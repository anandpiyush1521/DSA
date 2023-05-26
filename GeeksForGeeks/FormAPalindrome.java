import java.util.*;
public class FormAPalindrome{
    public static int countMin(String str){
        return minInsertion(str.toCharArray(), 0, str.length()-1);
    }
    public static int minInsertion(char[] str, int low, int high){
        if(low > high) return Integer.MAX_VALUE;
        if(low == high) return 0;
        if(low == high-1) return (str[low]==str[high])? 0 : 1;

        if(str[low]==str[high]){
            return minInsertion(str, low+1, high-1);
        }else{
            int insertAtleft = minInsertion(str, low, high-1);
            int insertAtright = minInsertion(str, low+1, high);
            return Math.min(insertAtright, insertAtleft)+1;
         }
    }
    public static void main(String[] args){
        String str = "abcd";
        System.out.println(countMin(str));
    }
}