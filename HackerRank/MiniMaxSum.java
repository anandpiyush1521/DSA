import java.util.*;
public class MiniMaxSum{
    public static void miniMaxSum(List<Integer> arr){
        long min = (long) Integer.MAX_VALUE;
        long max = (long) Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(3);
        // arr.add(5);
        // arr.add(7);
        // arr.add(9);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        miniMaxSum(arr);
    }
}