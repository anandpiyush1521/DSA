package cdac;
import java.util.*;
public class Problem13 {
    public static int appearOnce(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element that appears only once is: " + appearOnce(arr, n));
    }
}
