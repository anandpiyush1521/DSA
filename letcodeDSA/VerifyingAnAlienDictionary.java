/* In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Example 3:
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info). */

import java.util.*;
public class VerifyingAnAlienDictionary{
    public static boolean isAlienSorted(String[] words, String order){
        Map<Character, Integer> keys = new HashMap<Character, Integer>();
        for(int i=0; i<order.length(); i++){
            keys.put(order.charAt(i), i);
        }
        for(int i=1; i<words.length; i++){
            String a = words[i-1];
            String b = words[i];
            for(int j=0; j<a.length(); j++){
                if(j == b.length()) return false;
                char ch1 = a.charAt(j);
                char ch2 = b.charAt(j);
                if(keys.get(ch1) < keys.get(ch2)) break;
                if(keys.get(ch1) > keys.get(ch2)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words, order));
    }
}