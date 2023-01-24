import java.util.*;

public class UnionArray{

    public static ArrayList<Integer> UnionArray(int arr1[], int arr2[], int n, int m){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i: arr1){
            set.add(i);
        }
        for(int i: arr2){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: set){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args){
        int[] arr1 = {2, 8, 7, 9, 10, 1};
        int[] arr2 = {10, 8, 7, 6, 5, 3};
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> result = UnionArray(arr1, arr2, n, m);
        for(int i: result){
            System.out.print(i+ " ");
        }
    }
}