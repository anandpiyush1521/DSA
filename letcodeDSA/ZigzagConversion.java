/* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
 
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I                          */

import java.util.*;
public class ZigzagConversion{
    public static String convert(String s, int numRows){
        if(numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        int row=0;
        int dir=0;
        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            row += dir;
            sb[row].append(c);

            if(row==0 || row==numRows-1){
                dir = (dir == 0) ? 1 : -dir;
            }
        }
        return convert(sb);
    }
    public static String convert(StringBuilder[] sb){
        StringBuilder result = new StringBuilder();
        for(StringBuilder s: sb){
            result.append(s.toString());
        }
        return result.toString();
    }
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int n= 3;
        System.out.println(convert(s, n));
    }
}