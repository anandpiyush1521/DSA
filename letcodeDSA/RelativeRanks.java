import java.util.*;
public class RelativeRanks{
    public static void findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<score.length; i++){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] prize = {"Gold Medal","Silver Medal","Bronze Medal"};
        for(int i=score.length-1; i>=0; i--){
            int rank = score.length-1-i;
            if(rank < 3){
                res[map.get(score[i])] = prize[rank];
            }else{
                res[map.get(score[i])] = " "+(rank+1);
            }
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] score = {5,4,3,2,1};
        findRelativeRanks(score);
    }
}