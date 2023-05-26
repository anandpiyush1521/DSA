import java.util.*;
public class Solution {
    public static int isWinner(int[] player1, int[] player2) {
        int sumPlayer1 = playerScore(player1);
        int sumPlayer2 = playerScore(player2);
        
        if(sumPlayer1 == sumPlayer2){
            return 0;
        }else if(sumPlayer1 < sumPlayer2){
            return 2;
        }else{
            return 1;
        }
    }
    public static int playerScore(int[] nums){
        boolean foundTen = false;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(i==0 || i==1){
                sum += nums[i];
            }else{
                if(atIndexOneTwo(nums) || foundTen==true){
                    sum += 2*nums[i];
                }else{
                    sum += nums[i];
                }
            }
            if(nums[i] == 10) foundTen=true;
        }
        return sum;
    }
    public static boolean atIndexOneTwo(int[] nums){
        if(nums[0]==10 || nums[1]==10){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] player1 = {9,7,10,7};
        int[] player2 = {10,2,4,10};
        //System.out.println(isWinner(player1, player2));
        System.out.println(playerScore(player1));
    }
}