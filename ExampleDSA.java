import java.util.*;
public class ExampleDSA{
    static ArrayList<ArrayList<Integer>> adj;
    public ExampleDSA(int n){
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
        boolean[] visited = new boolean[v];
        ArrayList<Integer> bfs = new ArrayList<>();

        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        
        visited[0] = true;

        while(!qu.isEmpty()){
            int node = qu.poll();
            bfs.add(node);

            for(Integer neighbour: adj.get(node)){
                if (!visited[neighbour]){
                    qu.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args){
        int n = 6;
        ExampleDSA ex = new ExampleDSA(n);
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