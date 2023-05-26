/* Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:
Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john,jackie,jamie,jamie,john,johnny,jamie,johnny,john}
Output: john 4
Explanation: john has 4 votes casted for him, but so does johny. john is lexicographically smaller, so we print john and the votes he received.      */

import java.util.*;
public class WinnerOfElection{
    public static String[] winner(String arr[], int n){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String str: arr){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }
        int max = 0;
        String champ = "";
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer val = entry.getValue();
            if(val > max){
                max = val;
                champ = key;
            }else if(val == max && champ.compareTo(key) > 0){
                champ = key;
                max = val;
            }
        }
        return new String[] {champ, Integer.toString(max)};
    }
    public static void main(String[] args){
        String Votes[] = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
        int n = Votes.length;

        System.out.println(winner(Votes, n));
    }
}

// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1?page=1&company[]=Atlassian&sortBy=submissions