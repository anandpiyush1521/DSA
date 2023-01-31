import java.util.*;
public class DivisibleBySumPairs{
    public static int divisibleSumPairs(int n, int k, List<Integer> ar){
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((ar.get(i) + ar.get(j))% k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);

        int n = 6;
        int k = 3;
        System.out.println(divisibleSumPairs(n, k, ar));
    }
}