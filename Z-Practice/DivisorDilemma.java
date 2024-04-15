import java.util.*;
public class DivisorDilemma{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            Map<Integer, List<Integer>> adjList = generateAdjList(N);

            System.out.println(findSum(M, adjList));
        }
    }
    public static List<Integer> findDivisor(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                list.add(i);
            }
        }
        return list;
    }
    public static Map<Integer, List<Integer>> generateAdjList(int N){
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i=1; i<=N; i++){
            List<Integer> divisors = findDivisor(i);
            adjList.put(i, divisors);
        }
        return adjList;
    }
    public static int findSum(int M, Map<Integer, List<Integer>> adjList){
        List<Integer> sortedNumbers = new ArrayList<>(adjList.keySet());

        sortedNumbers.sort((a, b) -> {
            int sizeComparison = Integer.compare(adjList.get(b).size(), adjList.get(a).size());
            if(sizeComparison == 0){
                return Integer.compare(b, a);
            }
            return sizeComparison;
        });

        Map<Integer, List<Integer>> sortedAdjList = new LinkedHashMap<>();
        for(int num: sortedNumbers){
            sortedAdjList.put(num, adjList.get(num));
        }

        // System.out.println("Sorted Adjacency List:");
        // for (Map.Entry<Integer, List<Integer>> entry : sortedAdjList.entrySet()) {
        //     System.out.println(entry.getKey() + " => " + entry.getValue());
        // }

        int sum = 0;
        int count = 0;

        for(Map.Entry<Integer, List<Integer>> entry: sortedAdjList.entrySet()){
            if(count >= M){
                break;
            }
            List<Integer> adjacency = entry.getValue();
            for(int adjacent: adjacency){
                sum += adjacent;
            }
            count++;
        }
        return sum;
    }
    // public static ArrayList<ArrayList<Integer>> findMaxSum(int N, int M){
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //     for(int i=0; i<=N; i++){
    //         adj.add(new ArrayList<>());
    //     }

    //     for(int i=1; i<=N; i++){
    //         storeDivisor(i, adj);
    //     }

    //     Collections.sort(adj, (a, b) -> Integer.compare(b.size(), a.size()));

    //     return adj;

    // }
    // public static void storeDivisor(int num, ArrayList<ArrayList<Integer>> adj){
        
    //     for(int i=1; i<=num; i++){
    //         if(num%i == 0){
    //             adj.get(num).add(i);
    //             // count++;
    //         }
    //     }
    // }
}