import java.util.*;
public class ExtractNumberFromString{
    public static long ExtractNumber(String S){
        //code here
        long largestNumber = Long.MIN_VALUE;
        String[] words = S.split("\\s+");
        for(String word : words){
            //check if word is a number
            if(word.matches("\\d+")){
                long number = Long.parseLong(word);
                if(number > largestNumber && !containsNine(number)){
                    largestNumber = number;
                }
            }
        }
        return largestNumber;
    }
    public static boolean containsNine(long number){
        while(number > 0){
            long digit = number % 10;
            if(digit == 9) return true;

            number /= 10;
        }
        return false;
    }
    public static void main(String[] args){
        String Sentence="This is alpha 5057 and 97";
        System.out.println(ExtractNumber(Sentence));
    }
}