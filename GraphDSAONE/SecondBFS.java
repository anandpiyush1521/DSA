import java.util.*;
public class SecondBFS{
    static ArrayList<ArrayList<Integer>> adj;

    public SecondBFS(int n){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
    }
    public static void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    // public void printGraph() {
    //     for (int i = 0; i < adj.size(); i++) {
    //         System.out.print("Adjacency list of vertex " + i + ": ");
    //         for (int j = 0; j < adj.get(i).size(); j++) {
    //             System.out.print(adj.get(i).get(j) + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> qu = new LinkedList<>();

        qu.add(0);
        visited[0] = true;

        while(!qu.isEmpty()){
            int node = qu.remove();
            bfs.add(node);
            // for(int i=0; i<adj.get(node).size(); i++){
            //     int neighbour = adj.get(node).get(i);
            //     if(visited[neighbour] == false){
            //         visited[neighbour] = true;
            //         qu.add(neighbour);
            //     }
            // }
            for(Integer neighbour: adj.get(node)){
                if(!visited[neighbour]){
                    qu.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args){
        int n = 5;
        SecondBFS graph = new SecondBFS(n);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        // graph.printGraph();

        System.out.println(bfsOfGraph(n, adj));
    }
}