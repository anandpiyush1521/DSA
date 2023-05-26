import java.util.*;
public class NonRepeatingCharacter {
    public static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : S.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Return a default value for no non-repeating characters
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(nonrepeatingCharacter(s));
    }
}
