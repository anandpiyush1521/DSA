import java.util.*;
public class LongestDuplicateString{
    public static String longestDupSubstring(String s) {
        String[] suffix = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            suffix[i] = s.substring(i);
        }
        Arrays.sort(suffix);

        int n = s.length();

        String ans = "";
        for(int i=0; i<n-1; i++){
            String temp = lcp(suffix[i], suffix[i+1]);
            if(temp.length() > ans.length()){
                ans = temp;
            }
        }
        return ans;
    }
    public static String lcp(String str1, String str2){ // longestvcommom prefix;
        int len = Math.min(str1.length() , str2.length());
        for(int i=0; i<len; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, len);
    }
    public static void main(String[] args){
        String s = "nnpxouomcofdjuujloanjimymadkuepightrfodmauhrsy";
        System.out.println(longestDupSubstring(s));
    }
}