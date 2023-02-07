import java.util.*;
public class ZigZagSeqquence{
    public static void zigzag(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=0; i<=n-2; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            zigzag(arr, n);
        }
    }
}