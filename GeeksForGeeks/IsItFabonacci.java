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
        long[] res = new long[N];
        for(int i = 0; i < GeekNum.size(); i++){
            res[i] = GeekNum.get(i);
        }
        for(int i=K; i<N; i++){
            res[i] = res[i-1];
            for(int j=i-K; j<i; j++){
                res[i] += res[j];
            }
        }
        return res[N - 1];
    }
    public static void main(String[] args){
        
    }
}