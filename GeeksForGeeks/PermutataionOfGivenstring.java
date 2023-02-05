/* Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

Example 1:
Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .

Example 2:
Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation: Given string ABSG has 24 permutations.                      */

import java.util.*;
public class PermutataionOfGivenstring{
    public static List<String> find_permutation(String S){
        List<String> res = new ArrayList<String>();
        find(S, res, "");
        Collections.sort(res);
        return res;
    }
    public static void find(String s, List<String> ans, String str){
        if(s.length() == 0){
            if(ans.contains(str)){
                return;
            }
            ans.add(str);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            String next = left + right;

            find(next, ans, str+c);
        }
    }
    public static void main(String[] args){
        String s = "ABC";
        System.out.println(find_permutation(s));
    }
}