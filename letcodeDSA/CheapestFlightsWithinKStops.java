/*There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.

Example 1:

Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.
Example 2:


Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.
Example 3:

Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500. */

import java.util.*;
class tuple{
    int first , second , third ; 
    public tuple(int first , int second , int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Pair{
    int first , second;
    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int CheapestFlightsWithinKStops(int n,int flights[][],int src,int dst,int k) {
        int m = flights.length;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i  = 0 ; i < m ; i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1] , flights[i][2]));
        }
        int dist[] = new int[n];
        Arrays.fill(dist , (int) 1e9);
        dist[src] = 0;

        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(0 , src , 0));

        while(!q.isEmpty()){
            tuple temp = q.peek();
            int stops = temp.first;
            int node = temp.second;
            int cost = temp.third;
            q.remove();
            if(stops > k) continue;
            for(Pair it : adj.get(node)){
                int adjNode = it.first;
                int edgeWeight = it.second;   
                if(cost + edgeWeight < dist[adjNode] && stops <= k){
                    dist[adjNode] = cost + edgeWeight;
                    q.add(new tuple(stops + 1, adjNode , cost + edgeWeight));
                }
            }
        }
        if(dist[dst] == (int)1e9) return -1;
        return dist[dst];
    }
}
