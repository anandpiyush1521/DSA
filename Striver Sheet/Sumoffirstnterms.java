import java.util.*;
public class Sumoffirstnterms{

    public static long getsumofnterms(long num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += Math.pow(i, 3); 
        }
        return sum;
    }

    public static void main(String[] args){
        double now = System.currentTimeMillis();
        Timecomplexity demo = new Timecomplexity();
        long num = 5000;
        long ans = getsumofnterms(num);
        //System.out.println(ans);

        System.out.println(demo.sumofnterms(5000));
        System.out.println("Time taken - "+ (System.currentTimeMillis() - now)+" milliseconds" );

    }
}