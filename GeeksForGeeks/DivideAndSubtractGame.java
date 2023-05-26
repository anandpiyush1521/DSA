/* Jon and Arya are playing a game. Rules of game as follows:
  They have a single number N initially.
   Both will play an alternate move. Jon starts first.
   Both will play each move optimally.
   In each move, they can perform only one of these operation
          1. Divide that number by 2, 3, 4 or 5 and take floor of result.
          2. Subtract that number by 2, 3, 4 or 5.
   If after making a move the number becomes 1, the player who made the move automatically loses the game.
   When number becomes zero, the game will stop and the player who can't make a move loses the game.

Example 1:
Input:
N = 3
Output:
Jon
Explanation: Jon will just subtract 3 from initial number and win the game.

Example 2:
Input:
N = 6
Output:
Arya
Explanation: Jon will divide by 3 and then in next step Arya will subtract by 2 and win the game.                */

import java.util.*;
public class DivideAndSubtractGame{
    public static String divAndSub(int N) {
        if(N==1){
            return "Arya";
        }
        if(N < 6) return "Jon";
        int[] game = new int[N+1];
        int i;
        for(i=1; i<6; i++){
            game[i] = 1;
        }
        for(i=6; i<=N; i++){
            if(game[i/2]==0 || game[i/3]==0 || game[i/4]==0 || game[i/5]==0){
                game[i] = 1;
            }else if(game[i-2]==0 || game[i-3]==0 || game[i-4]==0 || game[i-5]==0){
                game[i]=1;
            }else{
                game[i] = 0;
            }
        }
        if(game[N] == 1) return "Jon";

        return "Arya";
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(divAndSub(n));
    }
}
//https://practice.geeksforgeeks.org/problems/divide-and-subtract-game2253/1