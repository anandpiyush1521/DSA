/* You are given a string ‘S’. It contains English alphabets (both lowercase and uppercase), digits, and special characters (including ‘?’). You can perform the following operations on ‘S’ any number of times :
Replace any uppercase character with its lowercase counterpart.
Replace any ‘?’ with any English character.
Calculate the total number of distinct strings we can obtain after performing the above operations any number of times (including 0). Since this number can be quite large, return it modulo 1000000007.
Example :
‘S’ = xY?
‘?’ can be replaced by any character from a-z or A-Z (or can be left unchanged) and Y can be converted to y. Hence, the answer is 106.
Detailed explanation ( Input/output format, Notes, Constraints, Images )

Sample Input 1 :
2
4
a2?B
2
ab
Sample Output 1 :
106
1
Explanation For Sample Input 1 :
For the first test case, ‘?’ can be replaced by any character from a-z or A-Z (or can be left unchanged) and B can be converted to b. Hence, the answer is 106.

In the second test case, there is no character which can be changed, so only one string is possible.
Sample Input 2:
2
3
qJ?
2
?Q
Sample Output 2:
106
106   */

import java.util.*;
public class CountPossibleStrings{
    static int countSubstrings(int n, String s) {
        // Write your code here.
    }
    public static void main(String[] args){
        
    }
    https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
    https://leetcode.com/problems/product-of-array-except-self/ 
    https://leetcode.com/problems/scramble-string/   
    
}
