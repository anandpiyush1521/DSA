import java.util.*;
public class TransposeOfMatrix{
    public static void transpose(int[][] matrix, int n){
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = matrix[j][i];
            }
        }
    }
    public static void main(String[] args){
        int n =4; 
        int[][] matrix =    {{1, 1, 1, 1},
                            {2, 2, 2, 2},
                            {3, 3, 3, 3},
                            {4, 4, 4, 4}};
        
        transpose(matrix, n);
    }
}