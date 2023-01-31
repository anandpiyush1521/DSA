import java.util.*;
public class BreakingTheRecords{
    public static List<Integer> breakingRecords(List<Integer> scores){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int most = scores.get(0);
        int least = scores.get(0);
        int min=0;
        int max=0;
        for(int i=1; i<scores.size(); i++){
            if(scores.get(i) > most){
                max++;
                most = scores.get(i);
            }
            if(scores.get(i) < least){
                min++;
                least = scores.get(i);
            }
        }
        result.add(max);
        result.add(min);

        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(12);
        scores.add(24);
        scores.add(10);
        scores.add(24);

        System.out.println(breakingRecords(scores));
    }
}