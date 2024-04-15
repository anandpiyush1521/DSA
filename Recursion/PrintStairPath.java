/* As mentioned in our problem you are given a number n representing the number of stairs in a staircase. You are standing at the bottom of the staircase. And you are allowed to climb 1 step, 2 steps or 3 steps in one move.

We need to complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.

Note -> The online judge can"t force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

For example:

Input: 3

Output:

1  1  1 
1  2 
2  1 
3 

*/


import java.util.*;
public class PrintStairPath{
    public static void main(String[] args){
        int n = 4;
        printStairsPath(n, " ");

    }
    public static void printStairsPath(int n, String path){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(path);
            return;
        }

        printStairsPath(n-1, path + "1");
        printStairsPath(n-2, path + "2");
        printStairsPath(n-3, path + "3");
    }
}