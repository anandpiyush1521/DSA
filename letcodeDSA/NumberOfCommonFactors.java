/* Given two positive integers a and b, return the number of common factors of a and b.
An integer x is a common factor of a and b if x divides both a and b.

Example 1:
Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.                */

import java.util.*;
public class NumberOfCommonFactors{
    public static int commonFactors(int a, int b){
       int smaller = Math.min(a, b);
       int count =0;
       for(int i=1; i<=smaller; i++){
        if(a%i==0 && b%i==0){
            count++;
        }
       }
       return count;
    }
    public static void main(String[] args){
        int a = 12;
        int b = 6;
        System.out.println(commonFactors(a, b));
    }
}