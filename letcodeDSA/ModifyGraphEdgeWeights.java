import java.util.*;
class ModifyGraphEdgeWeights {
    // Define the maximum possible weight for an edge, used to replace -1 weights
    public static int MAX = 2_000_000_000;

    // Graph represented as an adjacency list where each node has a map of its neighbors and edge weights
    Map<Integer, Map<Integer, Integer>> graph;

    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        // Initialize the graph
        graph = new HashMap<>();
        
        // Build the initial graph by adding all edges with valid weights
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int w = edge[2];

            // Only consider edges with a weight not equal to -1
            if (w != -1) {
                graph.computeIfAbsent(a, k -> new HashMap<>()).put(b, w);
                graph.computeIfAbsent(b, k -> new HashMap<>()).put(a, w);
            }
        }

        // Run Dijkstra's algorithm to find the shortest path from source to destination
        int currDist = dijkstra(source, destination);

        // If the current shortest path is already less than the target, return an empty array
        if (currDist < target) {
            return new int[0][0];
        }

        // Modify the edges with -1 weights to try to match the shortest path to the target distance
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int w = edge[2];

            // Skip edges that already have a defined weight
            if (w != -1) {
                continue;
            }

            // If the current shortest path matches the target, set the edge weight to MAX
            if (currDist == target) {
                edge[2] = MAX;
                continue;
            }

            // Temporarily set the edge weight to 1 to check the effect on the shortest path
            edge[2] = 1;
            graph.computeIfAbsent(a, k -> new HashMap<>()).put(b, 1);
            graph.computeIfAbsent(b, k -> new HashMap<>()).put(a, 1);

            // Recalculate the shortest path after modifying the edge
            currDist = dijkstra(source, destination);

            // If the modified path is less than or equal to the target, adjust the edge weight
            if (currDist <= target) {
                edge[2] += target - currDist; // Adjust the weight to match the target
                currDist = target; // Update current distance to match the target
            }
        }

        // Return the modified edges if the target distance is achieved, otherwise return an empty array
        return currDist == target ? edges : new int[0][0];
    }

    // Implementation of Dijkstra's algorithm to find the shortest path from source to destination
    private int dijkstra(int source, int destination) {
        // Priority queue to keep track of the node with the smallest distance
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0});

        // Set to keep track of visited nodes
        Set<Integer> visited = new HashSet<>();

        // Process nodes in the priority queue
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int dist = curr[1];

            // Skip nodes that have already been visited
            if (visited.contains(node)) {
                continue;
            }

            // Mark the current node as visited
            visited.add(node);

            // If the destination node is reached, return the distance
            if (node == destination) {
                return dist;
            }

            // Explore neighbors of the current node
            Map<Integer, Integer> neighbors = graph.getOrDefault(node, new HashMap<>());
            for (Map.Entry<Integer, Integer> entry : neighbors.entrySet()) {
                int nextNode = entry.getKey();
                int weight = entry.getValue();

                // If the neighbor hasn't been visited, calculate the new distance and add to the priority queue
                if (!visited.contains(nextNode)) {
                    int newDist = dist + weight;
                    pq.add(new int[]{nextNode, newDist});
                }
            }
        }

        // If the destination is not reachable, return the maximum possible distance
        return MAX;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of nodes and edges
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int m = scanner.nextInt();

        int[][] edges = new int[m][3];

        // Input edges
        System.out.println("Enter the edges in the format (a b w), where a and b are nodes, and w is the weight (use -1 for unknown weights):");
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
        }

        // Input source, destination, and target
        System.out.print("Enter the source node: ");
        int source = scanner.nextInt();
        System.out.print("Enter the destination node: ");
        int destination = scanner.nextInt();
        System.out.print("Enter the target distance: ");
        int target = scanner.nextInt();

        ModifyGraphEdgeWeights solution = new ModifyGraphEdgeWeights();
        int[][] modifiedEdges = solution.modifiedGraphEdges(n, edges, source, destination, target);

        // Output the modified edges
        if (modifiedEdges.length == 0) {
            System.out.println("No solution exists.");
        } else {
            System.out.println("Modified edges:");
            for (int[] edge : modifiedEdges) {
                System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
            }
        }

        scanner.close();
    }
}
