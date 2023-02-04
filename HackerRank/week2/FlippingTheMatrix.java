/* Sean invented a game involving a 2n * 2n matrix where each cell of the matrix contains an integer. He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the n *n submatrix located in the upper-left quadrant of the matrix.

Given the initial configurations for q matrices, help Sean reverse the rows and columns of each matrix in the best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal. 

Input :
matrix = [[1, 2], [3, 4]]
Output :
4

Input :
matrix = [[112, 42, 83, 119], [56, 125, 56, 49], [15, 78, 101, 43], [62, 98, 114, 108]]
Output :
119 + 114 + 56 + 125 = 414          */

import java.util.*;
public class FlippingTheMatrix{
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int n = matrix.size();
        for(int i=0; i<n/2; i++){
            for (int j = 0; j < n/2; j++) {
                sum += Math.max( matrix.get(i).get(j), 
                        Math.max( matrix.get(i).get(n-1-j),
                        Math.max( matrix.get(n-1-i).get(j), 
                        matrix.get(n-1-i).get(n-1-j))
                    )  
                );
            } 
        }
       
}