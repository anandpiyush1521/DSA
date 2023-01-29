import java.util.*;
public class EquilibiriumIndex{
    public static int findEquilibrium(int arr[], int n){
        int maxSum = 0;
        for(int i=0; i<n; i++){
            maxSum = maxSum + arr[i];
        }
        long sum = 0;
        for(int i=0; i<n; i++){
            if(maxSum - sum - arr[i] == sum ){
                return i;
            }else{
                sum = sum + arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr ={1,2,0,3};
        int n = 4;
        System.out.println(findEquilibrium(arr, n));
    }
}