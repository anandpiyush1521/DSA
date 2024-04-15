import java.util.*;

public class LexographicallySubsets {
    public static void main(String[] args) {
        String str = "cab";
        powerSet(str);
    }

    static ArrayList<ArrayList<String>> subsets;

    public static void powerSet(String str) {
        subsets = new ArrayList<>();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        backtracking(subsets, new ArrayList<>(), arr, 0);

        for (ArrayList<String> temp : subsets) {
            boolean first = true;
            for (String s : temp) {
                if (!first) {
                    System.out.print("");
                }
                System.out.print(s);
                first = false;
            }
            System.out.println();
        }
    }

    static void backtracking(ArrayList<ArrayList<String>> subsets, ArrayList<String> temp, char[] arr, int index) {
        if (temp.size() > 0) {
            subsets.add(new ArrayList<>(temp));
        }
        for (int i = index; i < arr.length; i++) {
            temp.add(String.valueOf(arr[i]));
            backtracking(subsets, temp, arr, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
