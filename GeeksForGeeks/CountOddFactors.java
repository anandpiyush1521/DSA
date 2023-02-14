/* Given an integer N, count the numbers having an odd number of factors from 1 to N (inclusive).

Example 1:
Input:
N = 5
Output:
2
Explanation: From 1 - 5 only 2 numbers, 1 and 4 are having odd number of factors.

Example 2:
Input:
N = 1
Output:
1
Explanation: 1 have only 1(odd) factor               */

import java.util.*;
public class CountOddFactors{
    // public static long count(int N){
    //     List<Long> res = new ArrayList<>();
    //     for(int i=1; i<=N; i++){
    //         long c = (long)countFactors(i);
    //         if(!isEven(c)){
    //             res.add(c);
    //         }
    //     }
    //     return res.size();
    // }
    // public static boolean isEven(long num){
    //     if(num%2 ==0) return true;

    //     return false;
    // }
    // public static int countFactors(int num){
    //     int count=0;
    //     for(int i=1; i<=num; i++){
    //         if(num % i == 0) count++;
    //     }
    //     return count;
    // }
    public static void main(String[] args){
        int N = 5;
        System.out.println(count(N));
    }
    public static long count(int N){
        return (long) Math.abs(Math.sqrt(N));
    }
}
