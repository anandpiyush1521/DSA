package com.sorting;

public class HeapSort {

    public static void constructHeapAndSwap(int[] arr){
        int n = arr.length;
        for(int i = n/2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n-1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7};
        constructHeapAndSwap(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
