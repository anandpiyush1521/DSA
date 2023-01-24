import java.util.*;
public class Reverseanarray{
    public static void main(String[] args){
        int b=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[100];
        for(int i=1; i<=a; i++){
            b = sc.nextInt();
        }
        // int c= b;
        // int b = sc.nextInt();
        for(int x=0; x<b; x++){
            arr[x] = sc.nextInt();
        }

        for(int i=b-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}