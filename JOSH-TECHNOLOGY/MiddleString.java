import java.util.*;
public class MiddleString{
    public static String middleWords(String str){
        String[] words = str.split(" ");
        int len = words.length;
        if(len % 2 == 0){
            String a =words[(len/2)-1];
            String b = words[(len/2)];
            if(a.length() > b.length()){
                return a;
            }else{
                return b;
            }
        }else{
            return words[len/2];
        }
    } 
    // public static int 
    public static void main(String[] args){
        String str = "My name is partabeen nagapalli chelar";
        System.out.println(middleWords(str));
    }
}