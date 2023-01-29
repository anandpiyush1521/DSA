/*  You are given an array of ‘N’ sentences. Each sentence is a space-delimited string of words. The first word in each sentence is an alphanumeric identifier. Then, at least one of the following conditions will hold true:
1. After identifier, each word will consist only of lowercase English letters
2. After the identifier, each word will consist only of numbers.
We will call these two types of sentences, letter – sentence and number– sentence. It is guaranteed that each sentence has at least one word after its identifier. Your task is to sort these sentences such that the following two conditions will hold.
1. All letter - sentences must come before number- sentences.
2. The letter - sentences must be ordered lexicographically ignoring identifiers. The identifier will be used in case of ties.
3. The number– sentence must be put in their original order of occurrence. 
Detailed explanation ( Input/output format, Notes, Constraints, Images )

Sample Input 1 :
2
3
d1 2 3
love8 coding world
a1 coding ninjas 
3 
rating1 2143 1706
g1 raone 
avengers1 assemble
Sample Output 1 :
a1 coding ninjas
love8 coding world
d1 2 3
avengers1 assemble
g1 raone
rating1 2143 1706
Explanation For Sample Input1:
For the first test case, 
Letter sentences are [“love8 coding world”,   “a1 coding ninjas”], and number sentences are [“d1 2 3”]
Sorted order of letter sentences = [“a1 coding ninjas”, “love8 coding world”]
The original order of number sentences =[“d1 2 3”]
So the answer is [“a1 coding ninjas”, “love8 coding world”, “d1 2 3”].

For the second test case:
Letter sentences are [“g1 raone”,  “avengers1 assemble”], and number sentences are [“rating1 2143 1706”]
Sorted order of letter sentences = [“avengers1 assemble”, “g1 raone”].
Original order of number sentences = [ “rating1 2143 1706”]
So the answer is [“avengers1 assemble” , “g1 raone” , “rating1 2143 1706”]
Sample Input 2 :
1
4
wait8 opportunity is coming
coding24 7 365
coding1 2 3 4 5
goodluck2 you my friend
Sample Output 2 :
wait8 opportunity is coming
goodluck2 you my friend
coding24 7 365 
coding1 2 3 4 5
Explanation For Sample Input2:
For the first test case:
Letter sentences are [“wait8 opportunity is coming”,  “goodluck2 you my friend”], and number sentences are [  “coding24 7 365”, “coding1 2 3 4 5”].
Sorted order of letter sentences = [“wait8 opportunity is coming”, “goodluck2 you my friend”].
Original order of number sentences =[“coding24 7 365”, “coding1 2 3 4 5”].
So the answer is [“wait8 opportunity is coming”, “goodluck2 you my friend”, “coding24 7 365”, “coding1 2 3 4 5”].   */

import java.util.*;
public class RearrangeSentences{
    public static List<String> reOrderSentences(String[] sentences) {
        List<String> letterSentences = new ArrayList<>();
        List<String> numberSentences = new ArrayList<>();
        for(String sentence: sentences){
            String[] words = sentence.split(" ");
            boolean isLetterSentence = true;
            for(int i=1; i<words.length; i++){
                if(!Character.isLetter(words[i].charAt(0))){
                    isLetterSentence = false;
                    break;
                }
            }
            if(isLetterSentence){
                letterSentences.add(sentence);
            }else{
                numberSentences.add(sentence);
            }
        }
        letterSentences.sort((a,b) -> {
            String[] aWords = a.split(" ");
            String[] bWords = b.split(" ");
            for(int i=1; i<Math.min(aWords.length, bWords.length); i++){
                int comparison = aWords[i].compareTo(bWords[i]);
                if(comparison != 0){
                    return comparison;
                }
            }
            return aWords[0].compareTo(bWords[0]);
        });
        letterSentences.addAll(numberSentences);
        return letterSentences;
    }

}