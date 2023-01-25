import java.util.*;
public class ContainerWithMaxArea{
    public static long maxArea(int A[], int len){
        int area=0;
        // for(int i=0; i<len; i++){
        //     for(int j=i+1; j<len; j++){
        //         area = Math.max(area, Math.min(A[j], A[i])*(j-i));
        //     }
        // }
        int i=0;
        int j = len-1;
        while(i < j){
            area = Math.max(area, Math.min(A[j], A[i])*(j-i));
            if(A[i] < A[j]){
                i += 1;
            }else{
                j -= 1;
            }
        }
        return area;
    }
    public static void main(String[] args){
        int[] arr = {1,5,4,3};
        int len = 4;
        System.out.println(maxArea(arr, len));
    }
}