import java.util.*;
public class MinOperationToMakeValidString{
    public static int addMinimum(String word) {
        int n = word.length();
        int count = 0;
        int i=0;
        while(i < n){
            if(word.charAt(i) == 'a'){
                if(i+1<n && word.charAt(i+1)=='b' && i+2<n && word.charAt(i+2)=='c'){
                    i += 3;
                }
                else if(i+1<n && word.charAt(i+1)=='b'){
                    count++;
                    i+=2;
                }else if(i+1<n && word.charAt(i+2)=='c'){
                    count++;
                    i+=2;
                }else{
                    count += 2;
                    i++;
                }
            }else if(word.charAt(i) =='b'){
                count++;
                if(i+1<n && word.charAt(i+1)=='c'){
                    i+=2;
                }else{
                    i++;
                    count++;
                }
            }else{
                count += 2;
                i++;
            }
        }
        return count;
    }
    // public static boolean isValidString(String word) {
    //     int countA=0;
    //     int countB=0;
    //     int countC=0;
    //     for(int i=0; i<word.length(); i++) {
    //         if(word.charAt(i) = 'a') countA++;
    //         if(word.charAt(i) == 'b') countB++;
    //         if(word.charAt(i) == 'c') countC++; 
    //     }
    //     if(countA == countB == countC) return true;
    // }
    public static void main(String[] args){
        String word = "aaa";
        System.out.print(addMinimum(word));
    }
}