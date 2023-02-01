import java.util.*;
public class PanagramString{
    public static String pangrams(String s){
        String s1 = "pangram";
        String s2 = "not pangram";
        boolean[] values = new boolean[26];
        int index=0;
        int flag=1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                index = s.charAt(i) - 'A';
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                index = s.charAt(i) - 'a';
            }
            values[index] = true;
        }
        for(int i = 0; i <= 25; i++){
            if(values[i] == false){
                flag = 0;
            }
        }
        if(flag == 1){
            return s1;
        }else{
            return s2;
        }
    } 
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangrams(str));
    }
}