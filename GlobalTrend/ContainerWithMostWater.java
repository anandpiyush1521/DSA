import java.util.*;

class ContainerWithMostWater{
    
    public static long maxArea(int A[], int len){
        // Code Here
        int area = 0;
        int i=0; 
        int j = len-1;
        while(i < j){
            area = Math.max(area, Math.min(A[i], A[j])*(j - i));
            if(A[i] < A[j]){
                i += 1;
            }else{
                j -= 1;
            }
        }
        return area;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.println("");
        System.err.println("Create Array!!! Enter Integers");
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Area: " + maxArea(arr, len));
    }
    
}