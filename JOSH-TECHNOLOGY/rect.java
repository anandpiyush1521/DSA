/* Problem:

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:


    1 -> A
    2 -> B
    3 -> C 
    26 -> Z
    27 -> AA
    28 -> AB  */

import java.util.*;
public class rect{
    public static void main(String[] args){
        int num = 23;
        // String str = new Character((char) num).toString();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch='a'; ch<='z'; ch++){
            map.put(ch, (ch-'a')+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 23){
                System.out.print(entry.getKey());
            }
        }
        // System.out.println(str);
    }
}