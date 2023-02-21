/* Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

Example 1:
Input:
N = 5
A = {1, 1, 2, 5, 5}
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.

Example 2:
Input:
N = 7
A = {2, 2, 5, 5, 20, 30, 30}
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.          */

import java.util.*;
public class FindElementAppearsOnce{
    public static int search(int A[], int N){
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int num: A){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // for(int key: map.keySet()){
        //     if(map.get(key) == 1) return key;
        // }
        // return -1;
        int re = A[0];
        for(int i=1; i<N; i++){
            re ^= A[i];
        }
        return re;
    }
    public static void main(String[] args){
        int[] A = {1, 1, 2, 5, 5};
        int N = 5;
        System.out.println(search(A, N));
    }
}