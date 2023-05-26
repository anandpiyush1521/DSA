import java.util.*;
public class RowWithMaxOne{
    public static void rowAndMaximumOnes(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[2];
        int maxCount = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1) count++;
            }
            if(count > maxCount){
                maxCount = count;
                index = i;
                ans[0] = index;
                ans[1] = maxCount;
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args){
        int[][] mat = {{0,0,0}, {0,1,1}};
        rowAndMaximumOnes(mat);
    }
}