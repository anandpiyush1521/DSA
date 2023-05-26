import java.util.*;
public class RemoveAndReverse{
    public static String removeReverse(String S){
        List<Character> list = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            list.add(c);
        }
        for(char c: list){
            sb.append(c);
        }
        boolean hasRepeatingChar = false;
        for(int i=0; i<sb.length()-1; i++){
            if(sb.charAt(i) == sb.charAt(i+1)){
                hasRepeatingChar = true;
                sb.deleteCharAt(i);
                break;
            }
        }
        sb.reverse();
        if(! hasRepeatingChar) return sb.toString();

        return sb.toString();
    }
    public static boolean hasRepeatingChar(StringBuilder sb) {
        for(int i = 0; i < sb.length(); i++){
            for(int j=1; j<=sb.length(); j++){
                if(sb.charAt(i) == sb.charAt(j)) return true;
            }
        }
        return false;
    }
    public static String reverseremove(StringBuilder Sb){
        boolean hasRepeatingChar = false;
        for(int i=0; i<sb.length() - 1; i++){
            if(sb.charAt(i) == sb.charAt(i+1)){
                hasRepeatingChar = true;
                sb.deleteCharAt(i);
                break;
            }
        }
        sb.reverse();


    }
    public static void main(String[] args){
        String str = "ccced";
        // removeReverse(str);
        System.out.println(removeReverse(str));
    }
}