/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+ 5 + 9 = 15.
.The right to left diagonal =  3 +5 +9 = 17 . Their absolute difference is
|15-17| = 2   */

import java.util.*;
public class DiagonalDifference{
    public static int diagonalDifference(List<List<Integer>> arr){
        int n = arr.size();
        int firstDiagnoal = 0;
        int secondDiagnoal = 0;
        for(int i=0; i<n; i++){
            firstDiagnoal = firstDiagnoal + arr.get(i).get(i);
            
            secondDiagnoal = secondDiagnoal + arr.get(i).get(n - (i+1));
        }  
        return Math.abs(firstDiagnoal - secondDiagnoal);
    }
    public static void main(String[] args){
        
    }
}