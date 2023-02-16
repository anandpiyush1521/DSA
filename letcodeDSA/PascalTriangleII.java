/* Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]             */                                                                                                                                    

import java.util.*;
public class PascalTriangleII{
    public static List<Integer> getRow(int rowIndex){
        int len = rowIndex+1;
        Integer[] arr = new Integer[len];
        Arrays.fill(arr, 1);

        for(int i=2; i<len; i++){
            for(int j=1; j<i; j++){
                arr[i-j] = arr[i-j] + arr[i-j-1];
            }
        }
        return Arrays.asList(arr);
    }
    public static void main(String[] args){
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}