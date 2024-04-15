import java.util.*;
public class DivisorDillema2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
           
            int M = sc.nextInt();

            List<Integer> sums = generateAndSortSums(N);

            System.out.println(findSumOfTopM(sums, M));
        }
    }

    public static List<Integer> generateAndSortSums(int N) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            List<Integer> divisors = findDivisors(i);
            int sum = divisors.stream().mapToInt(Integer::intValue).sum();
            sums.add(sum);
        }
        sums.sort(Comparator.reverseOrder());
        return sums;
    }

    public static List<Integer> findDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static int findSumOfTopM(List<Integer> sums, int M) {
        int sum = 0;
        for (int i = 0; i < M && i < sums.size(); i++) {
            sum += sums.get(i);
        }
        return sum;
    }
}