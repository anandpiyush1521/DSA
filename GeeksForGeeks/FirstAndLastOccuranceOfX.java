import java.util.*;
public class FirstAndLastOccuranceOfX{
    public static ArrayList<Long> find(long arr[], int n, int x){
        Arrays.sort(arr);
        ArrayList<Long> list = new ArrayList<Long>();
        long min=1;
        long max=1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                min = i;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i] == x){
                max = i;
                break;
            }
        }
        list.add(min);
        list.add(max);
        return list;
    }
    public static void main(String[] args){
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = 9;
        int x= 5;
        System.out.print(find(arr, n, x));
    }
}