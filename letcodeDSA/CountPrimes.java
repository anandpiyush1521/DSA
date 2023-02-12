import java.util.*;
public class CountPrimes{
    // public static int countPrimes(int n){
    //     if (n <= 2) return 0;
    //     int count = 0;
    //     for (int i = 2; i < n; i++) {
    //         if (isPrime(i)) count++;
    //     }
    //     return count;
    // }
    // public static boolean isPrime(int n){
    //     for(int i=2; i*i<=n; i++){
    //         if(n % i == 0) return false;
    //     }
    //     return true;
    // }
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] res = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (res[i]) continue;
            count++;
            for (int j = 2; j * i < n; j++) {
                res[j * i] = true;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(countPrimes(n));
    }
}