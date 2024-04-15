import java.util.*;
public class ProductMatrix{
    public static void main(String[] args){
        int[][] matrix = {{4,3,9}, {3,9,10}, {9,7,8}, {8,4,7}, {6,1,3}};

        constructProductMatrix(matrix);

    }
    public static void constructProductMatrix(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int[][] result = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j] = constructProduct(grid, i, j);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int constructProduct(int[][] grid, int i, int j){
        int product = 1;
        for(int a=0; a<grid.length; a++){
            for(int b=0; b<grid[0].length; b++){
                if(a!=i && b!=j){
                    product *= grid[a][b];
                }
            }
        }
        return product%12345;
    }
}