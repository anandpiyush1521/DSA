package com.sorting;
import java.util.*;
public class MergeSort {

    public static void mergeSort(int[] arr){
        if(arr.length < 2){
            return;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        for(int i = 0; i < left.length; i++){
            System.out.print(left[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < right.length; i++){
            System.out.print(right[i] + " ");
        }

        System.out.println();

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i < left.length){
            arr[k++] = left[i++];
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};
        mergeSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
