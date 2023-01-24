import java.util.*;
public class SymmetricalArray{

    public static void findSymmetrical(int arr1[], int arr2[], int m, int n){
        int i=0, j=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " " );
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " " );
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        while (i < n) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {2, 6, 7, 9, 10, 1};
        int[] arr2 = {10, 8, 7, 6, 5, 3};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println("Symmetrical Array: " );
        findSymmetrical(arr1, arr2, m, n);
    }
}