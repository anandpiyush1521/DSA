/* You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 109 + 7.

Example 1:
Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
Output: 4 
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green piece of cake has the maximum area.

Example 2:
Input: h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
Output: 6
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green and yellow pieces of cake have the maximum area.

Example 3:
Input: h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
Output: 9       */


import java.util.*;
public class MaximumAreaOfPieceOfCake{
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        ArrayList<Integer> horizontal = new ArrayList<Integer>();
        ArrayList<Integer> vertical = new ArrayList<Integer>();
        for(int el: horizontalCuts) {
            horizontal.add(el);
        }
        for(int el: verticalCuts) {
            vertical.add(el);
        }
        Collections.sort(horizontal);
        Collections.sort(vertical);

        if(horizontal.size() == 0){
            horizontal.add(0);
        }
        if(vertical.size() == 0){
            vertical.add(0);
        }
        horizontal.add(h);
        vertical.add(w);
        
        long maxHorizontal = horizontal.get(0);
        long maxVertical = vertical.get(0);

        for(int i=1; i<horizontal.size(); i++) {
            int diff = horizontal.get(i) - horizontal.get(i-1);
            maxHorizontal = Math.max(maxHorizontal, diff);
        }
        for(int i=1; i<vertical.size(); i++) {
            int diff = vertical.get(i) - vertical.get(i-1);
            maxVertical = Math.max(maxVertical, diff);
        }
        return (int)((maxHorizontal * maxVertical) % (1_000_000_007));
    }
    public static void main(String[] args){
        int h = 5;
        int w = 4;
        int[] horizontalCuts = {3};
        int[] verticalCuts = {3};

        System.out.println(maxArea(h, w, horizontalCuts, verticalCuts));
    }
}

// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/description/