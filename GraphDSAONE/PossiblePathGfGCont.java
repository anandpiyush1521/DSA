import java.util.*;

public class PossiblePathGfGCont {
    static int steps = 0;

    public static int possiblePath(int n, int m, int[][] grid) {
        if(grid[0][0]==1 || grid[n-1][m-1]==1){
            return -1;
        }
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<int[]> qu = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        qu.add(new int[]{0, 0, 0});

        visited[0][0] = true;

        while(!qu.isEmpty()){
            int[] curr = qu.poll();
            int x = curr[0];
            int y = curr[1];
            int steps = curr[2];

            if(x==n-1 && y==m-1){
                return steps;
            }

            int value = grid[x][y];

            for(int i=0; i<4; i++){
                int nr = x + dx[i];
                int nc = y + dy[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && !visited[nr][nc]){
                    if(grid[nr][nc]==0 || grid[nr][nc]==2 || (value==2 && grid[nr][nc]==1)){
                        visited[nr][nc] = true;
                        qu.add(new int[]{nr, nc, steps+1});
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] edges = { { 0, 2, 1 }, { 0, 1, 0 } };
        int n = edges.length;
        int m = edges[0].length;
        System.out.println(possiblePath(n, m, edges));
    }
}
