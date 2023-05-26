/* Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once.
Hence, the output is 3. 

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0                               ADOBE            */

import java.util.*;
public class NonRepeatingElement{
    public static int firstNonRepeating(int arr[], int n) { 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int el: arr){
            map.put(el, map.getOrDefault(el, 0)+1);
        }
        for(int num: arr){
            if(map.get(num) == 1) return num;
        }
        return 0;
    }
    public static void main(String[] args){
        int arr[] = {1, 1, 1};
        int n = 3;
        System.out.println(firstNonRepeating(arr, n));
    }
}

// https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1?page=1&company[]=Adobe&category[]=Arrays&sortBy=submissions