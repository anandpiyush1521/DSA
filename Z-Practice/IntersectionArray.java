import java.util.*;
public class IntersectionArray{

    public static void printIntersectionsArray(int arr1[], int arr2[]){
        HashSet<Integer> iset = new HashSet<Integer>();
        for(int i = 0; i < arr1.length; i++){
            iset.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if(iset.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] arr1 = {2, 6, 7, 9, 10, 1};
        int[] arr2 = {10, 8, 7, 6, 5, 3};

       

        System.out.print("Intersection of two array: ");
        printIntersectionsArray(arr1, arr2);
        
    }
}