package com.sorting;

public class BubbleSort {

    public static void bubbleSorting(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=1; j<n; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {64,34,25,12,22,11,90};
        bubbleSorting(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
