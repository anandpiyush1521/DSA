/*Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing. 

Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 5 is appearing twice and its first appearence is at index 2 which is less than 3 whose first occuring index is 3.

Example 2:
Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation: All elements appear only once so answer is -1.             */

import java.util.*;
public class FirstRepeatingElement{
    // public static int firstRepeated(int[] arr, int n){
    //     int index=0;
    //     for(int i=1; i<=arr.length; i++){
    //         for(int j=i+1; j<=arr.length; j++){
    //             if(arr[i-1] == arr[j-1]){
    //                 index = i;
    //             }
    //         }
    //     }
    //     if(!hasRepeatedElement(arr)){
    //         index = -1;
    //     }
    //     return index;
    // } 
    // public static boolean hasRepeatedElement(int[] arr){
    //     Set<Integer> set = new HashSet<Integer>();
    //     for(int num: arr){
    //         if(!set.add(num)) return true;
    //     }
    //     return false;
    // }
    public static int firstRepeated(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=1; i<=n; i++){
            if(map.get(arr[i-1]) > 1) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = 7;
        System.out.println(firstRepeated(arr, n));
    }
}

//https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1?page=1&company[]=Amazon&curated[]=2&sortBy=submissions