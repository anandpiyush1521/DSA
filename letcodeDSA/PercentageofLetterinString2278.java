import java.util.*;
public class PercentageofLetterinString2278{
    public static int percentageLetter(String s, char letter){
        int ans;
        int count = 0;
        int numOfStrings = s.length();
        char[] chr = new char[numOfStrings];
        for(int i = 0; i < numOfStrings; i++){
            chr[i] = s.charAt(i);
        }
        for(int i=0; i<chr.length; i++){
            if(chr[i] == letter){
                count++;
            }
        }
        ans = (count*100)/numOfStrings;
        return ans;
    } 
    public static void main(String[] args){
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s, letter));
    }
}