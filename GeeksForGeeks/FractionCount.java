import java.util.*;

public class FractionCount {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        
        Map<Double,Integer>mp=new HashMap<Double,Integer>();
        int ans=0;
        for(int i=0;i<n;i++){
            
            double key=(double)numerator[i]/(double)denominator[i];
            double target=(denominator[i] - numerator[i])*1.0/denominator[i];;
            
            if(mp.containsKey(target)){
                ans+=mp.get(target);
            }
            if(mp.containsKey(key)){
                mp.put(key,mp.get(key)+1);
            }else{
                mp.put(key,1);
            }
        }
        return ans;
        
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] numerator = {3, 1, 12, 81, 2};
        int[] denominator = {9, 10, 18, 90, 5};
        int n = 5;

        System.out.println(countFractions(n, numerator, denominator));
    }
}
