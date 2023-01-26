import java.util.*;
public class CaseSpecificSortingOfStrings{
    public static String caseSort(String str)
    {
        // Your code 
        PriorityQueue<Character> lower = new PriorityQueue<>();
        PriorityQueue<Character> upper = new PriorityQueue<>();
        for(char i : str.toCharArray()){
            if(Character.isLowerCase(i)){
                lower.add(i);
            } else {
                upper.add(i);
            }
        }
        char[] ch = new char[str.length()];
        int index = 0;
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                ch[index++] = lower.poll();
            } else {
                ch[index++] = upper.poll();
            }
        }
        return new String(ch);
    }
}