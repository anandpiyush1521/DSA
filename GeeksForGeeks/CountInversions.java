/* Given an array of integers. Find the Inversion Count in the array. 
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Example 1:
Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

Example 2:
Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.

Example 3:
Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.       */

import java.util.*;
public class CountInversions{
    public static long inversionCount(long arr[], long N){
        // long invCount = 0;
        // for(int i=0; i<N; i++){
        //     for(int j=i+1; j<N; j++){
        //         if(arr[i] > arr[j]){
        //             invCount++;
        //             System.out.print("{" + arr[i] + "," + arr[j] + "} , ");
        //         }
        //     }
        // }
        // return invCount;
        return mergeSort(arr, 0, (int)N-1);
    }
    public static long mergeSort(long arr[], int left, int right) {
        long invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr, left, mid+1, right);
        }
        return invCount;
    }
    public static long merge(long arr[], int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        long invCount = 0;
        long[] temp = new long[right - left + 1];
        while (i <= mid-1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k-left] = arr[i++];
            } else {
                temp[k-left] = arr[j++];
                invCount += mid - i;
            }
            k++;
        }
        while (i <= mid-1) {
            temp[k-left] = arr[i++];
            k++;
        }
        while (j <= right) {
            temp[k-left] = arr[j++];
            k++;
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i-left];
        }
        return invCount;
    }
    public static void main(String[] args){
        long[] arr = {2, 4, 1, 3, 5};
        long N = 5;
        System.out.println("\nInversion Count:" + inversionCount(arr, N));
    }
}