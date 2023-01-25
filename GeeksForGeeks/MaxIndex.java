import java.util.*;
public class MaxIndex{
    public static int maxIndexDiff(int A[], int N){
        int res = 0;
        int i = 0;
        int j = N-1;
        while(j >= i){
            if(A[i] <= A[j]){
                res = Math.max(res, j-i);
                i++;
                j = N-1;
            }else{
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1, 10};
        int N = 2;
        System.out.println(maxIndexDiff(arr, N));
    }
}