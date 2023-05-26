/* Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.                                   */

import java.util.*;
public class SortCharactersByFrequency{
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (ch1, ch2) -> map.get(ch2) - map.get(ch1));

        StringBuilder ans = new StringBuilder();
        for(char ch: list){
            int charCount = map.get(ch);
            for(int i=0; i<charCount; i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}

// https://leetcode.com/problems/sort-characters-by-frequency/