import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectionWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 

        int[] votes = new int[M];
        for (int i = 0; i < M; i++) {
            votes[i] = scanner.nextInt(); 
        }
        scanner.close();
        Map<Integer, Integer> candidateVotes = new HashMap<>();
        int currentWinner = -1;

        for (int i = 0; i < M; i++) {
            int candidate = votes[i];
            candidateVotes.put(candidate, candidateVotes.getOrDefault(candidate, 0) + 1);
            if (currentWinner == -1 || candidateVotes.get(candidate) > candidateVotes.get(currentWinner)
                    || (candidateVotes.get(candidate).equals(candidateVotes.get(currentWinner)) && candidate < currentWinner)) {
                currentWinner = candidate;
            }
            System.out.println(currentWinner);
        }
    }
}
