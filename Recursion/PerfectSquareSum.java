import java.util.*;
public class PerfectSquareSum{
    public static void main(String[] args){
        int arr[] = {2, 3, 5, 6, 8, 10};
        int sum = 10;

        List<List<Integer>> ans = perfectSum(arr, sum);

        System.out.println(ans);
    }
    public static List<List<Integer>> perfectSum(int[] arr, int sum){
        List<List<Integer>> subsets = new ArrayList<>();

        backtracking(subsets, new ArrayList<>(), arr, sum, 0);

        return subsets;

    }
    public static void backtracking(List<List<Integer>> subsets, List<Integer> temp, int[] arr, int sum, int index){

        if(isPerfect(temp, sum)){
            subsets.add(new ArrayList<>(temp));
        }

        for(int i=index; i<arr.length; i++){
            temp.add(arr[i]);
            backtracking(subsets, temp, arr, sum, i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static boolean isPerfect(List<Integer> temp, int sum){
        int sums=0;
        for(int el: temp){
            sums+=el;
        }
        return sums==sum;
    }
}