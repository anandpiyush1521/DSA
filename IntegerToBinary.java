import java.util.*;
public class IntegerToBinary{
    public static void AndGate(int a[], int b[]){
        int product;
        if(a.length== b.length){
            for(int i=0; i<a.length; i++){
                product = a[i] * b[i];
                System.out.println(product);
            }
        }
    }
    public static void main(String[] args){
        IntegerToBinary it = new IntegerToBinary();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String a = Integer.toBinaryString(num1);
        String b = Integer.toBinaryString(num2);
        
        System.out.println(a);
        System.out.println(b);

        // char[] arr1 = new char[100];
        // char[] arr2 = new char[100];

        // //System.out.println(a.charAt(2));

        // for (int i = 0; i < a.length(); i++) {
        //     arr1[i] = a.charAt(i);
        //     System.out.print(arr1[i] + " ");
        // }
        // System.out.println("");
        // for(int i = 0; i<b.length(); i++) {
        //     arr2[i] = b.charAt(i);
        //     System.out.print(arr2[i] + " ");
        // }
        // int product;

        // if(arr1.length == arr2.length) {
        //     for(int i = 0; i <arr1.length; i++) {
        //         product = arr1[i] * arr2[i];
        //         System.out.print(product);
        //     }
        // }

        int[] arr1 = new int[a.length()];
        int[] arr2 = new int[b.length()];
        
        for(int i=0; i<a.length(); i++) {
            arr1[i] = a.charAt(i) - '0';
            System.out.print(arr1[i]+" ");
        }
        // for(int i: arr1){
        //     System.out.println(i);
        // }
        System.out.println(" ");
        for(int j=0; j<b.length(); j++) {
            arr2[j] = b.charAt(j) - '0';
            System.out.print(arr2[j] + " ");
        }

        it.AndGate(int[] arr1, int[] arr2);
        


    }

    // public static void AndGate(int num1, int num2){

    // }
}