import java.util.*;
public class RotateArray{
    public static void rotateArr(int arr[], int d, int n){
        int[] res = new int[n];
        int index=0;
        for(int i=d; i<n; i++){
            res[index] = arr[i];
            index++;
        }
        for(int i=0; i<d; i++){
            res[index] = arr[i];
            index++;
        }
        for(int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int n=10;
        int d=3;
        rotateArr(arr, d, n);
    }
}

//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&company[]=Microsoft&category[]=Arrays&sortBy=submissions 