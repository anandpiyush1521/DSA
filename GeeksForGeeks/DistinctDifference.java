import java.util.*;
public class DistinctDifference{
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                set1.add(A[j]);
            }
            for(int j=i+1; j<N; j++){
                set2.add(A[j]);
            }
            result.add(set1.size() - set2.size());
            set1.clear();
            set2.clear();
        }
        return result;
    }
    public static void main(String[] args){
        int n = 4;
        int[] arr = {4, 4, 3, 3};
        System.out.println(getDistinctDifference(n, arr));
    }
}