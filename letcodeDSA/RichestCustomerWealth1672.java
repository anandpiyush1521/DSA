import java.util.*;
public class RichestCustomerWealth1672{
    public static int maximumWealth(int[][] accounts){
        int sum = 0;
        for (int i = 0; i < accounts.length; i++){
            int sum1=0;
            for (int j = 0; j < accounts[i].length; j++){
                sum1 = sum1 + accounts[i][j];
            }
            sum = Math.max(sum, sum1);
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[][] = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
}