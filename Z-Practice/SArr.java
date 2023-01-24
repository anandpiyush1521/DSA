import java.util.*;
public class SArr{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];
        for(int i = 0; i < n; i++){
            myArray[i] = sc.nextInt();
        }
        System.out.println(myArray);
    }
}