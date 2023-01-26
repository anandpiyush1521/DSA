import java.util.*;
public class ReverseTheArray{
    public static void reverseArray(ArrayList<Integer> arr, int m){
        int start = m+1;
        int end = arr.size() - 1;
        while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        // Collections.reverse(arr.subList(m + 1, arr.size()));
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int m = 3;

        reverseArray(arr, m);
        System.out.println(arr); // Output: [1, 2, 3, 4, 6, 5]
    }
}