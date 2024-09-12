/*

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 

*/


import java.util.*;
public class CountNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String str: words){
            int flag=1;
            for(int i=0; i<str.length(); i++){
                if(!set.contains(str.charAt(i))){
                    flag=0;
                    break;
                }
            }
            count += flag;
        }
        return count;
    }
    public static void main(String[] args){
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        int ans = countConsistentStrings(allowed, words);
        System.out.println("Count the Number of Consistent Strings are : " + ans);
    }
}
