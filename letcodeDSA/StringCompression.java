import java.util.*;
public class StringCompression{
    public static int compress(char[] chars) {
        if(chars.length == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : chars){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int count = map.get(c);
            sb.append(c);
            if (count > 1) {
                sb.append(count);
            }
            i += count - 1;
        }
        String compressed = sb.toString();
        for (int i = 0; i < compressed.length(); i++) {
            chars[i] = compressed.charAt(i);
        }
        return compressed.length();      
    }
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.print(compress(chars));
    }
}