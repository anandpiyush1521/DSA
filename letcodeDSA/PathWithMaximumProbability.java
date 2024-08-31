/*
1514. Path with Maximum Probability 
You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].

Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.

If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5. 
*/


import java.util.*;

public class PathWithMaximumProbability {

    // A class to represent a pair of (weight, vertex), which is used in the priority queue.
    private static class Pair implements Comparable<Pair> {
        double weight;
        int vertex;

        // Constructor to initialize the pair with weight and vertex.
        Pair(double weight, int vertex) {
            this.weight = weight;
            this.vertex = vertex;
        }

        // Overriding compareTo method to compare pairs based on their weights.
        @Override
        public int compareTo(Pair other) {
            return Double.compare(this.weight, other.weight);
        }
    }

    // Adjacency list to represent the graph.
    private List<List<Pair>> adj;
    // Constant to represent infinity, used to initialize distances.
    private static final double INF = Double.POSITIVE_INFINITY;

    // Method to create the adjacency list for the graph.
    private void createAdj(int n, int[][] edges, double[] succProb) {
        adj = new ArrayList<>();
        // Initialize the adjacency list with empty lists for each vertex.
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int eN = edges.length;
        // Populate the adjacency list with the edges and their corresponding probabilities.
        for (int i = 0; i < eN; i++) {
            int v0 = edges[i][0], v1 = edges[i][1];
            // Convert success probability to logarithmic weight to use in Dijkstra's algorithm.
            double weight = -Math.log(succProb[i]) / Math.log(2);
            adj.get(v0).add(new Pair(weight, v1));
            adj.get(v1).add(new Pair(weight, v0));
        }
    }

    // Method to calculate the maximum probability of reaching from the start node to the end node.
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        // Array to store the minimum distance (maximum probability in logarithmic form) to each node.
        double[] dist = new double[n];
        Arrays.fill(dist, INF); // Initialize all distances as infinity.
        createAdj(n, edges, succProb); // Create the adjacency list.

        // Priority queue to process nodes in order of their distance from the start node.
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, start)); // Start with the start node (distance 0).
        dist[start] = 0; // Distance to the start node is 0.

        // Process the nodes in the priority queue.
        while (!pq.isEmpty()) {
            Pair current = pq.poll(); // Get the node with the smallest distance.
            double curDist = current.weight;
            int i = current.vertex;

            // If we reach the end node, return the probability by converting back from log form.
            if (i == end)
                return Math.pow(2, -curDist);

            // Explore the neighbors of the current node.
            for (Pair neighbor : adj.get(i)) {
                double nextDist = neighbor.weight;
                int j = neighbor.vertex;
                double newDist = curDist + nextDist;

                // If a shorter path to the neighbor is found, update the distance and add to the queue.
                if (newDist < dist[j]) {
                    dist[j] = newDist;
                    pq.offer(new Pair(newDist, j));
                }
            }
        }
        return 0.0; // If the end node is not reachable, return 0.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of nodes and edges.
        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of edges: ");
        int m = scanner.nextInt();

        int[][] edges = new int[m][2];
        double[] succProb = new double[m];

        // Input edges and their success probabilities.
        System.out.println("Enter the edges (u, v) and success probabilities:");
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            succProb[i] = scanner.nextDouble();
        }

        // Input start and end nodes.
        System.out.print("Enter start node: ");
        int start = scanner.nextInt();

        System.out.print("Enter end node: ");
        int end = scanner.nextInt();

        // Create a solution instance and compute the maximum probability.
        PathWithMaximumProbability solution = new PathWithMaximumProbability();
        double result = solution.maxProbability(n, edges, succProb, start, end);

        // Output the result.
        System.out.printf("Maximum probability of reaching node %d from node %d is: %.6f\n", end, start, result);
    }
}
