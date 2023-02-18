/* Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:
Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.

Example 2:
Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number is 2.                 */

import java.util.*;
public class FindMissingAndRepeating{
    public static int[] findTwoElement(int arr[], int N){
        boolean visited[] = new boolean[N+2];
        int [] ans = new int[2];
        int j = 0;
        
        for(int i=0; i<N+2; i++){
            if(visited[arr[i]]){
                ans[j] = arr[i];
                j++;
            }else{
                visited[arr[i]] = true;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,3,4,3};
        int n = 4;
        System.out.println(findTwoElement(arr, n));
    }
}