import java.util.*;
public class FizzBuzz412{
    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            boolean divisibleBy3 = i%3==0;
            boolean divisibleBy5 = i%5==0;

            String curstr = "";
            if(divisibleBy3 && divisibleBy5){
                result.add("FizzBuzz");
            }else if(divisibleBy3){
                result.add("Fizz");
            }else if(divisibleBy5){
                result.add("Fizz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(fizzBuzz(n));
    }
}