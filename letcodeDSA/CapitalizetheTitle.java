import java.util.*;
public class CapitalizetheTitle{
    public static String capitalizeTitle(String title){
        title = title.toLowerCase();
        String[] str = title.split(" ");
        String result = "";
        for(String s: str){
            if(s.length() > 2){
                result += Character.toUpperCase(s.charAt(0)) + s.substring(1)+" ";
            }else{
                result += s + " ";
            }
        }
        return result.trim();
    }
    public static void main(String[] args){
        String s = "First leTTeR of EACH Word";
        System.out.println(capitalizeTitle(s));
    }
}