import java.util.*;
public class FrequenciesofArray{

    public static void frequenciesofArray(int[] array, int n){
        int p = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > p){
                p = array[i];
            }
        }
        System.out.println("P = "+p);

        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }

            int count=1;
            for(int j=i+1; j<n; j++){
                if(array[i] == array[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.print(count +" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[100];
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        frequenciesofArray(arr, n);
    }
}