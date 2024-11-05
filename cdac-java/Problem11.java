package cdac;
import java.util.*;
public class Problem11 {
    public static int maxValue(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            max = Math.max(max, i);
        }        
        return max;
    }
    public static int minValue(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for(int i: arr){
            min = Math.min(min, i);
        }        
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum value is: " + maxValue(arr, n));
        System.out.println("The minimum value is: " + minValue(arr, n));
    }
}
