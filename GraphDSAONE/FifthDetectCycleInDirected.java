import java.util.*;
public class FifthDetectCycleInDirected{
    static ArrayList<ArrayList<Integer>> adj;

    public FifthDetectCycleInDirected(int n){
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
        boolean[] recs = new boolean[v];  //recusrion stack
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(dfs(i, adj, visited, recs)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recs){
        visited[v] = true;
        recs[v] = true;

        for(Integer neighbour: adj.get(v)){
            if(!visited[neighbour]){
                if(dfs(neighbour, adj, visited, recs)) return true;
            }else if(recs[neighbour]){
                return true;
            }
        }
        recs[v] = false;
        return false;
    }

    public static void main(String[] args){
        int n = 4;
        FifthDetectCycleInDirected graph = new FifthDetectCycleInDirected(n);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        System.out.println(isCycle(n, adj));
    }
}