import java.util.*;

class Node {
    Node[] children;
    boolean eow;

    public Node() {
        children = new Node[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        eow = false;
    }
}

class Trie {
    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A'; // Change 'a' to 'A'

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }

    public static boolean search(char[][] board, int i, int j, Node root) {

        int n = board.length;
        int m = board[0].length;

        if (i< 0 || i >= n || j < 0 || j >= m || board[i][j] == '#') {
            return false;
        }
        char ch = board[i][j];
        int index = ch - 'A';

        if (root.children[index] == null) {
            return false;
        }

        if (root.children[index].eow) {
            root.children[index].eow = false;
            return true;
        }

        board[i][j] = '#'; // mark as visited

        // boolean isFound = search(board, row + 1, col, root.children[index])
        //         || search(board, row - 1, col, root.children[index])
        //         || search(board, row, col + 1, root.children[index])
        //         || search(board, row, col - 1, root.children[index]);

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int k=0; k<4; k++){
            int nr = i + dx[k];
            int nc = j + dy[k];

            if(nr>=0 && nr<n && nc>=0 && nc<m){
                if(search(board, i, j, root.children[index])){
                    return true;
                }
            }
        }

        board[i][j] = ch; // revert back to its original
        return false;
    }
}

public class TrieWordSearch {
    public static boolean exist(char[][] board, String word) {

        Trie trie = new Trie();
        trie.insert(word);

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (trie.search(board, i, j, trie.root)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCB";

        System.out.println(TrieWordSearch.exist(board, word));
    }
}
