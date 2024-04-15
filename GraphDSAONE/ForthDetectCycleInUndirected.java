import java.util.*;
public class ForthDetectCycleInUndirected{
    static ArrayList<ArrayList<Integer>> adj;

    public ForthDetectCycleInUndirected(int n){
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
            if(visited[i] == false){
                if(dfs(i, adj, visited, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent){
        visited[v] = true;
        for(int i=0; i<adj.get(v).size(); i++){
            int neighbour = adj.get(v).get(i);
            if(visited[neighbour] == false){
                if(dfs(neighbour, adj, visited, parent)){
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
        ForthDetectCycleInUndirected graph = new ForthDetectCycleInUndirected(n);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(2, 4);

        System.out.println(isCycle(n, adj));
    }
}