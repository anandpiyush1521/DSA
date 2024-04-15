import java.util.*;
public class SixthTopologicalSort{
    static ArrayList<ArrayList<Integer>> adj;

    public SixthTopologicalSort(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfs(adj, i, stack, visited);
            }
        }
        int[] ans = new int[v];
        int index=0;
        while(!stack.isEmpty()){
            ans[index++] = stack.pop();
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] visited){
        visited[v] = true;
        for(Integer neighbour: adj.get(v)){
            if(!visited[neighbour]){
                dfs(adj, neighbour, stack, visited);
            }
        }
        stack.push(v);
    }

    public static void main(String[] args){
        int n = 6;
        SixthTopologicalSort graph = new SixthTopologicalSort(n);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(1, 4);
        graph.addEdge(5, 1);
        graph.addEdge(5, 4);

        topoSort(n, adj);
    }
}