import java.util.*;
public class DifferenceOfArray{

    public static void printDifference(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i=0, j=0;
        while(i<n  && j<m){
            System.out.print(arr1[i] - arr2[j]+ "  ");
            i++;
            j++;
        }
    }

    public static void printDifference2(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i=0, j=0;
        while(i<n  && j<m){
            System.out.print(arr2[j] - arr1[i]+ "  ");
            i++;
            j++;
        }
    }


    public static void main(String[] args){
        int[] arr1 = {2, 6, 7, 9, 10, 1};
        int[] arr2 = {10, 8, 7, 6, 5, 3};

        System.out.print("Difference of arrays(A - B): ");
        printDifference(arr1, arr2);
        System.out.println("");
        System.out.print("Difference of arrays(B - A): ");
        printDifference2(arr1, arr2);
    }
}