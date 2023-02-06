import java.util.*;
public class PermutingTwoArray{
    public static String twoArrays(int k, List<Integer> A, List<Integer> B){
        String a = "YES";
        String b = "NO";

        int n = A.size();
        Collections.sort(A);
        Collections.sort(B);
        for(int i = 0; i < n; i++){
            if((A.get(i) + B.get(n-i-1)) >= k){
                return a;
            }
        }
        return b;
    }
    public static void main(String[] args){
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        A.add(2);
        A.add(1);
        A.add(3);
        
        B.add(7);
        B.add(8);
        B.add(9);

        int k = 10;
        System.out.println(twoArrays(k, A, B));
    }
}