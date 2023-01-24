import java.util.*;
public class CountDigit{
    public static void main(String[] args) {
        int count = 0;     
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        while(num!=0){
            num = num/10;
            count++;
        }
        int x = num/10;
        int y = num%10;
        int p=0;
        int q=0;
        if(num%x==0){
            p++;
        } 
        if(num%y == 0){
            q++;
        }
        int result = p+q;
        
        System.out.println("NUmber of digit is: "+count);
        System.out.println("answer is " + result);
    }
}