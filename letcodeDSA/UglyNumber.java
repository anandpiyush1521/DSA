/* An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

Example 2:
Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.        */

import java.util.*;
public class UglyNumber{
    public static boolean isUgly(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 2 == 0){
            return isUgly(n/2);
        }else if(n % 3 == 0){
            return isUgly(n/3);
        }else if(n % 5 == 0){
            return isUgly(n/5);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(isUgly(n));
    }
}

// https://leetcode.com/problems/happy-number/description/ - Happy Number