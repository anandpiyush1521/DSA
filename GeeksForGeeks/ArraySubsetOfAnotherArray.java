/* Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 

Example 1:
Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation: a2[] is a subset of a1[]

Example 2:
Input:
a1[] = {1, 2, 3, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation: a2[] is a subset of a1[]

Example 3:
Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation: a2[] is not a subset of a1[]     */


import java.util.*;
public class ArraySubsetOfAnotherArray{
    public static String isSubset( long a1[], long a2[], long n, long m){
        String a = "YES";
        String b = "NO";
        // Set<Long> set1 = new HashSet<Long>();
        // for(long num: a1){
        //     set1.add(num);
        // }
        // for(int i=0; i<m; i++){
        //     if(!set1.contains(a2[i])) return b;
        // }
        // return a;
        int i=0, j=0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i < n && j < m) {
            if(a1[i] == a2[j]){
                i++;
                j++;
            }else if(a1[i] < a2[j]){
                i++;
            }else{
                j++;
            }
        }
        if(j == m){
            return a;
        }
        return b;
    }
    public static void main(String[] args){
        long a1[] = {11, 1, 13, 21, 3, 7};
        long n = 6;
        long a2[] = {11, 3, 7, 1};
        long m = 4;

        System.out.println(isSubset(a1, a2, n, m));
    }
}