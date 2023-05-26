import java.util.*;
public class EqualRowAndColumnPairs{
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boolean flag = true;
                for(int k=0; k<n; k++) {
                    if(grid[i][k] == grid[k][j]){
                        continue;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag == true) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
}