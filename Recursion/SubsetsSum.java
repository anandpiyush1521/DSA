import java.util.*;
public class SubsetsSum{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        ArrayList<Integer> ans = subsetssum(arr);

        System.out.println(ans);
    }
    public static ArrayList<Integer> subsetssum(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        backtracking(subsets, new ArrayList<>(), arr, 0);

        ArrayList<Integer> ans = new ArrayList<>();

        for(ArrayList<Integer> temp: subsets){
            ans.add(findSum(temp));
        }

        Collections.sort(ans);  

        return ans;

    }
    private static void backtracking(ArrayList<ArrayList<Integer>> subsets, ArrayList<Integer> temp, ArrayList<Integer> arr, int index){
        
        subsets.add(new ArrayList<>(temp));

        for(int i=index; i<arr.size(); i++){
            temp.add(arr.get(i));
            backtracking(subsets, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }
    private static int findSum(ArrayList<Integer> temp){
        int sum = 0;
        if(temp.size() == 0) return 0;

        for(int el: temp){
            sum += el;
        }
        return sum;
    }
}