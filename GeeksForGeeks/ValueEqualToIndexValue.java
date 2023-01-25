//java
import java.util.*;
public class ValueEqualToIndexValue{
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(arr[i] == i+1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {15, 2, 45, 12, 7};
        int n = 5;
        System.out.println(valueEqualToIndex(arr, n));
    }
}