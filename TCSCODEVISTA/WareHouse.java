import java.util.*;
import java.util.stream.Collectors;
public class WareHouse {
    private static int minimumVehicles(List<Integer> weights, int limit) {
        List<Integer> resWeight = weights.stream()
                .filter(x -> x != 0)
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        int left = 0;
        int right = resWeight.size() - 1;
        int ans = 0;

        while (left <= right) {
            if (resWeight.get(left) + resWeight.get(right) <= limit) {
                right--;
            }
            left++;
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        List<Integer> weights = Arrays.stream(arr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxLimit = scanner.nextInt();

        int result = minimumVehicles(weights, maxLimit);
        System.out.print(result);
    }
}
