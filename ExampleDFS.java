import java.util.*;
public class ExampleDFS{
    static ArrayList<ArrayList<Integer>> adj;
    public ExampleDFS(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    } 
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static ArrayList<Integer> answer(ArrayList<ArrayList<Integer>> adj, int v){
        boolean visited[] = new boolean[v];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfs(i, adj, list, visited);
            }
        }
        return list;
    }
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list, boolean[] visited){
        visited[node] = true;
        list.add(node);

        for(Integer neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, adj, list, visited);
            }
        }
    }

    public static void main(String[] args){
        int n = 6;
        ExampleDFS ex = new ExampleDFS(n);
        ex.addEdge(0, 1);
        ex.addEdge(0, 3);
        ex.addEdge(3, 4);
        ex.addEdge(1, 4);
        ex.addEdge(1, 2);
        ex.addEdge(2, 5);
        ex.addEdge(4, 5);

        System.out.println(answer(adj, n));
    }
}