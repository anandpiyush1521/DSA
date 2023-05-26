import java.util.*;
public class LongestBalanceSubstring{
    public static int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0'){
                int zero=0, one=0;
                while(i<s.length() && s.charAt(i) == '0'){
                    i++;
                    zero++;
                }
                while(i<s.length() && s.charAt(i) == '1'){
                    i++;
                    one++;
                }
                --i;
                int len = Math.min(zero, one);
                ans = Math.max(ans, 2*len);
            }
        }
        return ans;
    }
    // public static boolean isValid(String s) {
    //     //check weather string contains equal number of 0's & 1's
    //     int countZero = 0;
    //     int countOne = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) == '0') countZero++;
    //         if(s.charAt(i) == '1') countOne++;
    //     }
    //     if(countZero == countOne){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    public static void main(String[] args){
        String s = "00111";
        System.out.println(findTheLongestBalancedSubstring(s));
    }
}