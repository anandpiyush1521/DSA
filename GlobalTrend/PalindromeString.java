import java.util.*;
public class PalindromeString {
    public static boolean isStringPalindrome(String str) {
        if(str == null){
            return false;
        }
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left=0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input String: ");
        String str = sc.nextLine();

        if(isStringPalindrome(str)){
            System.out.println(str + " is palinfromic String");
        }else{
            System.out.println(str + " is not palinfromic String");
        }
    } 
}
