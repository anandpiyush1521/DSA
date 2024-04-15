import java.util.*;
public class GraphIsTreeOrNot{
    static ArrayList<ArrayList<Integer>> adj;

    public GraphIsTreeOrNot(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(dfs(i, visited, adj, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int parent){
        visited[v] = true;
        for(Integer neighbour : adj.get(v)){
            if(!visited[neighbour]){
                if(dfs(neighbour, visited, adj, v)){
                    return true;
                }
            }else if(parent != neighbour){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int n = 5;
        GraphIsTreeOrNot graph = new GraphIsTreeOrNot(n);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        // graph.addEdge(1, 0);
        // graph.addEdge(1, 2);
        // graph.addEdge(0, 2);
        // graph.addEdge(0, 3);
        // graph.addEdge(3, 4);

        if(isCycle(n, adj)){
            System.out.println("Graph is not tree");
        }else{
            System.out.println("Graph is a tree");
        }
    }
}