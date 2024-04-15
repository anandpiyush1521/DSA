import java.util.*;
public class SpiralMatrix{
    public static List<Integer> spiralPrint(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int top=0, left=0, right=m-1, bottom=n-1;

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void rotateBY90(int[][] matrix){

    }
    public static void transpose(int[][] matrix){
        int n = matrix.length; // matrix array should be square array
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                swap(matrix, i, j);
            }
        }
    }
    public static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void main(String[] args){
        // int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(arr);

        List<Integer> ans = spiralPrint(arr);

        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}