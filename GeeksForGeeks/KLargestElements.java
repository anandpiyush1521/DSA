/*Given an array of N positive integers, print k largest elements from the array. 

Example 1:
Input:
N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element in the array is 787 and the second largest is 23.         */

import java.util.*;
public class KLargestElements{
    public static ArrayList<Integer> kLargest(int arr[], int n, int k){
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        //Arrays.sort(arr);
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(result.size() != k){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args){
        int[] arr = {12,5,787,1,23};
        int n = 5;
        int k = 2;
        System.out.println(kLargest(arr, n, k));
    }
}