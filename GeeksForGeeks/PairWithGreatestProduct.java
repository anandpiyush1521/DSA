import java.util.*;
public class PairWithGreatestProduct{
    public static int findGreatest(int arr[], int n){
        // int res=-1;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n-1; j++){
        //         for(int k=j+1; k<n; k++){
        //             if(arr[i] == arr[j]*arr[k]){
        //                 res = Math.max(res, arr[i]);
        //             }
        //         }
        //     }
        // }
        // return res;
        Arrays.sort(arr);
        int i = n-1;
        while(i > 1){
            int left = 0;
            int right = i-1;
            while(left < right){
                if(arr[i] == arr[left]*arr[right]) return arr[i];
                else if(arr[left]*arr[right] > arr[i]) right--;
                else left++;
            }
            i--;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {10, 3, 5, 30, 35};
        int n = 5;
        System.out.println(findGreatest(arr, n));
    }
}