import java.util.*;
public class SeventhMinimumSpanningTree{
    public static void main(String[] args){
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};

        ArrayList<Long> list = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        for(long i: arr1){
            list.add(i);
        }
        for(long i: arr2){
            list.add(i);
        }

        Collections.sort(list);
        for(int i=0; i<n; i++){
            arr1[i] = list.get(i);
        }
        for(int i=n; i<m+n; i++){
            arr2[i-n] = list.get(i);
        }

        for(int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for(int i=0; i<m; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}