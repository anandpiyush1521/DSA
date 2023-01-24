import java.util.*;
public class Fire{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] arr = new int[q];
        for(int i = 0; i < q; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}