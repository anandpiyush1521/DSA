import java.util.*;
public class WordSearch{
    public static boolean isExist(char[][] board, String word){
        int n = board.length;
        int m = board[0].length;

        int[][] visited = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==word.charAt(0) && visited[i][j]==0){
                    if(dfs(i, j, board, word, visited, 1)){   // 0
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i, int j, char[][] board, String word, int[][] visited, int pos){
        if(pos == word.length()){
            return true;
        }
        visited[i][j]=1;

        int n = board.length;
        int m = board[0].length;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for(int k=0; k<4; k++){
            int nr = i + dx[k];
            int nc = j + dy[k];

            if(nr>=0 && nr<n && nc>=0 && nc<m){
                if(board[nr][nc]==word.charAt(pos) && visited[nr][nc]==0){
                    if(dfs(nr, nc, board, word, visited, pos+1)){
                        return true;
                    }
                }
            }
        }
        visited[i][j] = 0;
        return false;
    }
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCB";

        System.out.print(isExist(board, word));
    }
}