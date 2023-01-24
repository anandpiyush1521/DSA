import java.util.*;
public class NumberofStepstoReduceaNumbertoZero1342{
    public static int numberOfSteps(int num){
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;
        int steps =0;
        while(num>0){
            if(isEven){
                num = num/2;
            }else if(isOdd){
                num = num-1;
            }
            steps++;
        }
        return steps;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.println(numberOfSteps(num));
    }
}