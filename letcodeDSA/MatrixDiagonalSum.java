/* Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8                              */

import java.util.*;
public class MatrixDiagonalSum{
    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for(int i = 0; i < n; i++){
            firstDiagonal  = firstDiagonal + mat[i][i];

            secondDiagonal = secondDiagonal + mat[i][n-(i+1)];
        }
        if(n%2 == 0){
            return (firstDiagonal + secondDiagonal);
        }else{
            return (firstDiagonal + secondDiagonal - mat[n/2][n/2]);
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}