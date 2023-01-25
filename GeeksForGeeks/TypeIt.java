import java.util.*;
public class TypeIt{
    public static int minOperation(String s) {
        // code here
        if(s.length() == 1) return 1;
        int ans = 0;
        String str = "";
        for(int i = 0; i < s.length(); i++){
            str += s.charAt(i);
            String S = s.substring(i + 1);
            if(S.indexOf(str) != -1){
                ans = i + 1;
            } else{
                ans += (s.length() - (2 * ans) + 1);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "abcabca";
        System.out.println(minOperation(str));
    }
}