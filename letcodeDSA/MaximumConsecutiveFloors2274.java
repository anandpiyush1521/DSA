/* Alice manages a company and has rented some floors of a building as office space. Alice has decided some of these floors should be special floors, used for relaxation only.
You are given two integers bottom and top, which denote that Alice has rented all the floors from bottom to top (inclusive). You are also given the integer array special, where special[i] denotes a special floor that Alice has designated for relaxation.
Return the maximum number of consecutive floors without a special floor.

Example 1:
Input: bottom = 2, top = 9, special = [4,6]
Output: 3
Explanation: The following are the ranges (inclusive) of consecutive floors without a special floor:
- (2, 3) with a total amount of 2 floors.
- (5, 5) with a total amount of 1 floor.
- (7, 9) with a total amount of 3 floors.
Therefore, we return the maximum number which is 3 floors.      */

import java.util.*;
public class MaximumConsecutiveFloors2274{
    public static int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans = 0;
        int prev = bottom - 1;
        for (int i = 0; i < special.length; i++) {
            int current = special[i];
            if (current > top) break;
            ans = Math.max(ans, current - prev - 1);
            prev = current;
        }
        ans = Math.max(ans, top - prev);
        return ans;
    }
    // public static int countNumber(int a, int b){
    //     int n = Math.abs(a - b);
    //     int count = 0;
    //     for(int i = 0; i <=n; i++){
    //         count ++;
    //     }
    //     return count;
    // }
    public static void main(String[] args){
        int bottom = 2;
        int top = 9;
        int[] special = {4, 6};
        System.out.println(maxConsecutive(bottom, top, special));
    }
}