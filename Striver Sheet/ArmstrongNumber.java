import java.util.*;
public class ArmstrongNumber{

    public static boolean isArmstrong(int num){
        int originalNo = num;
        int count=0;
        int temp=num;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int sumofpower=0;
        while(num!=0){
            int digit = num%10;
            sumofpower += Math.pow(digit, count);
            num = num/10;
        }
        return(sumofpower == originalNo);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Yes it is armstrong number");
        }else{
            System.out.println("No it is not armstrong number");
        }
    }
}