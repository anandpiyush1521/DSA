/* A space explorer’s ship crashed on Mars! They send a series of SOS messages to Earth for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string,s , determine how many letters of the SOS message have been changed by radiation.

Example
s=’SOSTOT’
The original message was SOSSOS. Two of the message’s characters were changed in transit.

Function Description
Complete the marsExploration function in the editor below.
marsExploration has the following parameter(s):
string s: the string as received on Earth

Returns
int: the number of letters changed during transmission
Input Format
There is one line of input: a single string,s .
Constraints
1<=length of s <=99
Length of s modulo 3 = 0
s will contain only uppercase English letters, ascii[A-Z].

Sample Input 0
SOSSPSSQSSOR
 
Sample Output 0
3                                              */


import java.util.*;
public class MarsExploration{
    public static int marsExploration(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(i % 3 == 1){
                if(s.charAt(i) != 'O') count++;
            }else{
                if(s.charAt(i) != 'S') count++;
            }
        }
        return count;
    }
    public static  void main(String[] args){
        String s = "SOSTOT";
        System.out.println(marsExploration(s));
    }
}