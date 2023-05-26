import java.util.*;
public class StockBuyAndSell2{
    public static int maxProfit(int[] arr){
        int profit=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
        
        // int maxProfit=0;
        // int minsofar=arr[0];
        // for(int i=0; i<arr.length; i++){
        //     minsofar = Math.min(minsofar,arr[i]);
        //     int profit = arr[i] - minsofar;
        //     maxProfit =Math.max(maxProfit, profit);
        // }
        // return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(arr));
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/