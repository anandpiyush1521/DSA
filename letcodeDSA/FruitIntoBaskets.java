/* You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop. Given the integer array fruits, return the maximum number of fruits you can pick.

Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.

Example 2:
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2]. If we had started at the first tree, we would only pick from trees [0,1].   */

import java.util.*;
public class FruitIntoBaskets{
    public static int totalFruit(int[] fruits){
        int i = 0;
        int j;
        int max = 0;
        int count = 0;
        int[] fruit = new int[fruits.length];
        for(j = 0; j < fruits.length; j++){
            if(fruit[fruits[j]] == 0){
                count += 1;
            }
            fruit[fruits[j]] += 1;
            while(count > 2){
                fruit[fruits[i]] -= 1;
                if(fruit[fruits[i]] == 0){
                    count -= 1;
                }
                i += 1;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
    public static void main(String[] args){
        int[] fruits = {0, 1, 2, 2};
        System.out.println(totalFruit(fruits));
    }
}