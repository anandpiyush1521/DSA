/* Geek just learned about Fibonacci numbers.
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, ...
where the next number is found by adding up the two numbers before it.
He defines a new series called Geeky numbers. Here the next number is the sum of the K preceding numbers.
You are given an array of size K, GeekNum[ ], where the ith element of the array represents the ith Geeky number. Return its Nth term.
Note: This problem can be solved in O(N2) time complexity but the user has to solve this in O(N). The Constraints are less because there can be integer overflow in the terms.

Example 1:
Input:
N = 6, K = 1
GeekNum[] = {4}
Output: 
4
Explanation: Terms are 4, 4, 4, 4, 4, 4

Example 2:
Input:
N = 5, K = 3
GeekNum[] = {0, 1, 2}
Output: 
6
Explanation: Terms are 0, 1, 2, 3, 6. So the 5th term is 6            */

import java.util.*;
public class IsItFabonacci{
    public static long solve(int N, int K, ArrayList<Long> GeekNum){
        long sum = 0;
        int i =0;
        int j = K;
        for(i =0;i<K;i++){
            sum += GeekNum.get(i);
        }
        
        while(j<N){
            GeekNum.add(sum);
            sum -= GeekNum.get(j-K);
            sum += GeekNum.get(j);
            j++;
        }
        return GeekNum.get(N-1);
    }
    public static void main(String[] args){
        
    }
}