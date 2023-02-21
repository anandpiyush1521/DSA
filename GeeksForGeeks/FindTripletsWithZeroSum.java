import java.util.*;
public class FindTripletsWithZeroSum{
    public static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int sum=0;
            int left=i+1;
            int right = n-1;
            while(left < right){
                sum = arr[i] + arr[left] + arr[right];
                
                if(sum == 0){
                    return true;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {0, -1, 2, -3, 1};
        int n = 5;

        System.out.println(findTriplets(arr, n));
    }
}