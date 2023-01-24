import java.util.*;

public class Checkifanumberisprimeornot{

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean answer = isPrime(num);
        if(num!=1 && answer == true){
            System.out.println("Number is prime");
        } else{
            System.out.println("Number is not prime");
        }
    }
}