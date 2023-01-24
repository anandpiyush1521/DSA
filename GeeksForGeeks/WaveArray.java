import java.util.*;
public class WaveArray{
    public static void convertToWave(int n, int[] a){
        int temp;
        for(int i=0; i<n-1; i++){
            if(a[i] < a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;          
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        convertToWave(arr, n);
    } 
}