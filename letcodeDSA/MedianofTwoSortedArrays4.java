import java.util.*;
public class MedianofTwoSortedArrays4{
    public static double findSortedArrays(int[] arr, int n){
        Arrays.sort(arr);
        if(n%2 != 0){
            return (double)arr[n / 2];
        }else{
            return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int z = x+y;
        int[] newArray = new int[z];
        for(int i = 0; i <x; i++){
            newArray[i] = nums1[i];
        }
        for(int i = 0; i <y; i++){
            newArray[x + i] = nums2[i];
        }
        int n = newArray.length;
        return findSortedArrays(newArray, n);
    }
    public static void main(String[] args){
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}