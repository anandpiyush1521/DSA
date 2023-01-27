import java.util.*;
public class CountPairsWithGivenSum{
    public static int getPairsCount(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count=0;
        for(int i=0; i<n; i++){
            if(map.containsKey(k - arr[i])){
                count = count + map.get(k - arr[i]);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 1};
        int  n = 4;
        int k = 6;
        System.out.println(getPairsCount(arr, n, k));
    }
}