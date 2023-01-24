import java.util.*;
public class MaiximumIceCreamBars1833{
    public static int maxIceCream(int[] costs, int coins){
        int count=0;
        int num = costs.length;
        Arrays.sort(costs);
        for(int i = 0; i < num; i++){
            if(coins - costs[i] >= 0){
                count++;
                coins = coins - costs[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
}