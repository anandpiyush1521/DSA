/* A password is said to be strong if it satisfies all the following criteria:
It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.

Example 1:
Input: password = "IloveLe3tcode!"
Output: true
Explanation: The password meets all the requirements. Therefore, we return true.                   */

import java.util.*;
public class StrongPasswordChackerII{
    public static boolean strongPasswordCheckerII(String password){
        if(password.length() < 8){
            return false;
        }
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0; i<password.length(); i++){
            list.add(password.charAt(i));
        }
        boolean lowl = false;
        boolean upperl = false;
        boolean dig = false;
        boolean spChar = false;
        String special = "!@#$%^&*()-+";
        char previous = '.';
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == previous){
                return false;
            }
            previous = list.get(i);
            if(list.get(i) >= 'A' && list.get(i) <= 'Z'){
                upperl = true;
            }else if(list.get(i) >= 'a' && list.get(i) <= 'z'){
                lowl = true;
            }else if(list.get(i) >= '0' && list.get(i) <= '9'){
                dig = true;
            }else if(special.indexOf(list.get(i)) != -1){
                spChar = true;
            }
        }
    
        // for(int i = 0; i != password.length(); i++){
        //     char ch = password.charAt(i);
        //     if(ch == previous){
        //         return false;
        //     }
        //     previous = ch;
        //     if(ch >= '0' && ch <= '9'){
        //         dig = true;
        //     }else if(ch >= 'a' && ch <='z'){
        //         lowl = true;
        //     }else if(ch >= 'A' && ch<= 'Z'){
        //         upperl = true;
        //     }else if(special.indexOf(ch) != -1){
        //         spChar = true;
        //     }
        // }
        return lowl && upperl && spChar && dig;
    }
    public static void main(String[] args){
        String password = "IloveLe3tcode!";
        System.out.println(strongPasswordCheckerII(password));
    }
}