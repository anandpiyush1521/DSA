import java.util.*;
public class SieveAlgo{
    public static List<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j=j+i){
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int n = 30;

        List<Integer> ans = sieve(n);
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}