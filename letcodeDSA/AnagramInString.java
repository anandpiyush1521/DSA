/* Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".             */

import java.util.*;
public class AnagramInString{
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<Integer>();
        if(s.length() < p.length()){
            return result;
        }
        int[] map = new int[128];
        for(char c: p.toCharArray()){
            map[c]++;
        }
        int left = 0, right = 0;
        char[] chars = s.toCharArray();
        int m = s.length(), n = p.length(), count = n;
        while (right < m) {
            if (map[chars[right++]]-- > 0) count--;
            if (count == 0) result.add(left);
            if (right - left == n && map[chars[left++]]++ >= 0) count++;
        }
        return result;
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}