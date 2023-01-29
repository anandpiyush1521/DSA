/*  Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21  */

import java.util.*;
public class ProductAndSumSubtraction{
    public static int subtractProductAndSum(int n){
        int sum = sumOfDigit(n);
        int product = productOfDigit(n);
        int result = product - sum;
        return result;
    }
    public static int productOfDigit(int n){
        int res = 1;
        while(n!=0){
            res = res * (n%10);
            n = n/10;
        }
        return res;
    }
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n!=0){
            sum = sum * (n%10);
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
}