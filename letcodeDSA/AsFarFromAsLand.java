import java.util.*;
public class AsFarFromAsLand{
    public static int maxDistance(int[][] grid){
        List<int[]> lands = new ArrayList<>();
        int M = grid.length, N = grid[0].length, ans = -1;
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] == 1) lands.add(new int[]{i, j});
            }
        }
        if (lands.isEmpty() || M * N == lands.size()) return -1;
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] == 1) continue;
                int dist = Integer.MAX_VALUE;
                for (int[] p : lands) {
                    int d = Math.abs(p[0] - i) + Math.abs(p[1] - j);
                    dist = Math.min(dist, d);
                    if (dist <= ans) break;
                }
                ans = Math.max(ans, dist);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
        System.out.println(maxDistance(grid));
    }
}