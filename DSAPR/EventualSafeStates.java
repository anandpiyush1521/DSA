import java.util.*;
public class EventualSafeStates{
    static ArrayList<ArrayList<Integer>> adj;

    public EventualSafeStates(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static ArrayList<Integer> eventualSafeNodes(int V, ArrayList<ArrayList<Integer>> adj){
        int[] visited = new int[V];
        int[] pathVisited = new int[V];
        int[] check = new int[V];

        for(int i=0; i<V; i++){
            if(visited[i] == 0){
                dfs(i, adj, visited, pathVisited, check);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(); // safenodes
        for(int i=0; i<V; i++){
            if(check[i] == 1){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] pathVisited, int[] check){
        visited[node] = 1;
        pathVisited[node] = 1;
        check[node] = 0;

        for(int it: adj.get(node)){
            if(visited[it] == 0){
                if(dfs(it, adj, visited, pathVisited, check)){
                    return true;
                }
            }else if(pathVisited[it] == 1){
                return true;
            }
        }
        pathVisited[node] = 0;
        check[node] = 1;
        return false;
    }
    public static void main(String[] args){
        int n = 7;
        EventualSafeStates graph = new EventualSafeStates(n);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 2);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);
        graph.addEdge(6, 5);

        System.out.println(eventualSafeNodes(n, adj));
    }
}