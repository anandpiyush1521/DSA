import java.util.*;
class Node{
    int first; 
    int second;
    int third;
    public Node(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] visited = new int[n][m];
        int[][] distance = new int[n][m];

        Queue<Node> qu = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    qu.add(new Node(i, j, 0));
                    visited[i][j] = 1;
                }else{
                    visited[i][j] = 0;
                }
            }
        } 
        int[] deltaRow = {-1, 0, +1, 0};
        int[] deltaCol = {0, +1, 0, -1};
        while(!qu.isEmpty()){
            int row = qu.peek().first;
            int col = qu.peek().second;
            int steps = qu.peek().third;
            qu.remove();
            distance[row][col] = steps;
            for(int i=0; i<4; i++){
                int nrow = row + deltaRow[i];
                int ncol = col + deltaCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0){
                    visited[nrow][ncol] = 1;
                    qu.add(new Node(nrow, ncol, steps+1));
                }
            }
        }
        return distance;
    }
    public static void main(String[] args){
        int[][] mat = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        ZeroOneMatrix obj = new ZeroOneMatrix();
        int[][] ans = obj.updateMatrix(mat);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " "); 
            }
            System.out.println();
        }
    }
}