import java.util.*;
public class ThirdDFS{
    static ArrayList<ArrayList<Integer>> adj;

    public ThirdDFS(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<v; i++){
            if(visited[i] == false){
                dfs(i, adj, visited, ans);
            }
        }
        return ans;
    }
    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
        visited[v] = true;
        ans.add(v);

        for(int i=0; i<adj.get(v).size(); i++){
            int neighbour = adj.get(v).get(i);
            if(visited[neighbour] == false){
                dfs(neighbour, adj, visited, ans);
            }
        }
    }

    public static void main(String[] args){
        int n = 5;
        ThirdDFS graph = new ThirdDFS(n);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println(dfsOfGraph(n, adj));
    }
}