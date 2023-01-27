/* Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.

A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.

 

Example 1:

Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
Example 2:

Input: words = ["cat","dog","catdog"]
Output: ["catdog"]
 

Constraints:

1 <= words.length <= 10^4
1 <= words[i].length <= 30
words[i] consists of only lowercase English letters.
All the strings of words are unique.
1 <= sum(words[i].length) <= 10^5   */

import java.util.*;
public class ConcatenatedWords{
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        for(String wrd : words){
            if(concatenated(wrd, set)){
                result.add(wrd);
            }
        }
        return result;
    }
    public static boolean concatenated(String word, Set<String> dict){
        for (int i=1; i<word.length(); i++) {
            String left = word.substring(0, i) ;
            String right = word.substring(i) ;

            if(dict.contains(left)) {
                if(dict.contains(right) || concatenated(right, dict)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        System.out.println(findAllConcatenatedWordsInADict(words));
    }
}