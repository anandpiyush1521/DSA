/* Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false                               */

import java.util.*;
public class PermutationInString{
    public static boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        int[] res1 = new int[26];
        for(char c: s1.toCharArray()){
            res1[c - 'a']++;
        }

        for(int i=0; i<s2.length()-s1.length()+1; i++){
            int[] res2 = new int[26];
            for(int j=i; j<i+s1.length(); j++){
                res2[s2.charAt(j) - 'a']++;
            }
            if(Arrays.equals(res1,res2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}