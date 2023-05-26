/* We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:
Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

Example 2:
Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other. */

import java.util.*;
public class AsteroidCollision{
    public static void asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = asteroids.length;
        for(int i = 0; i < n; i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }else if(asteroids[i]>0 && stack.peek()>0 || stack.peek()<0 && asteroids[i]<0 || stack.peek()<0 && asteroids[i]>0){
                stack.push(asteroids[i]);
            }else if(Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                stack.pop();
                i--;
            }else if(Math.abs(stack.peek()) > Math.abs(asteroids[i])){
                continue;
            }else{
                stack.pop();
            }
        }
        int len = stack.size();
        int[] res = new int[len];
        while(len-- > 0){
            res[len] = stack.pop();
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] asteroids = {10,2,-5};
        asteroidCollision(asteroids);
    }
}