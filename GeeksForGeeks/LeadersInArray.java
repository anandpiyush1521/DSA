/* Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next 
leader is 5. The right most element is always a leader so it is also included.  */

import java.util.*;
public class LeadersInArray{
    public static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        int max=0;
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args){
        int[] arr = {16,17,4,3,5,2};
        int n = 6;
        System.out.println(leaders(arr, n));
    }
}