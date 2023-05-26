import java.util.*;
public class WidthOfColumns{
    public static void findColumnWidth(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[m];
        int max=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                max = Math.max(max, count(grid[j][i]));
            }
            ans[i] = max;
            max = 0;
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int count(int num){
        String str = Integer.toString(num);
        return str.length();
    }
    public static void main(String[] args){
        int[][] grid = {{1}, {3}, {33}};
        findColumnWidth(grid);
    }
}