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
Explanation: Repeating number is 3 and smallest positive missing number is 2. */


import java.util.*;
public class FindMissingRepeating{
    public static void findTwoElement(int arr[], int n) {
        // code here
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int el: arr){
            if(!set.contains(el)){
                set.add(el);
            }else{
                list.add(el);
            }
        }
        for(int i=1; i<=n; i++){
            if(!set.contains(i)) list.add(i);
        }
        int[] res = new int[list.size()];
        int index=0;
        for(Integer num: list){
            res[index++] = num;
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 3};
        int N = 3;
        findTwoElement(arr, N);
    }
}

//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1