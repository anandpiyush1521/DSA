/* You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing number is 6.

Example 2:
Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing number is 2.        */

import java.util.*;
public class SmallestPositiveMissingNumber{
    public static int missingNumber(int arr[], int size){
        // Arrays.sort(arr);
        // int negCount=0;
        // for(int i=0; i<size; i++{
        //     if(arr[i] < 0) negCount++;
        // }

        // int resSize = size - negCount;
        // int[] posArr = new int[resSize];
        Set<Integer> set = new HashSet<Integer>();
        for(int num: arr){
            if(num > 0) set.add(num);
        }

        for(int i=1; i<=size; i++){
            if(!set.contains(i)) return i;
        }
        return size+1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size=5;
        System.out.println(missingNumber(arr, size));
    }
}

//https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1?page=1&company[]=Amazon&category[]=Arrays&sortBy=submissions

//https://leetcode.com/problems/first-missing-positive/