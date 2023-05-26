// https://leetcode.com/problems/check-if-it-is-a-straight-line/

import java.util.*;
public class StraightLineCheck{
    public static boolean checkStraightLine(int[][] coordinates) {
        // if(coordinates.length == 0) return false;

        // double x1 = coordinates[0][0];
        // double y1 = coordinates[0][1];
        // double slope = Double.MIN_VALUE;
        // for(int i=1; i<coordinates.length; i++) {
        //     double x2 = coordinates[i][0];
        //     double y2 = coordinates[i][1];
        //     if(x2 == x1){
        //         for(int j=i+1; j<coordinates.length; j++){
        //             if(coordinates[j][0] != x1){
        //                 return false;
        //             }
        //         }
        //     }else{
        //         double curSlope = (y2-y1) / (x2-x1);
        //         if(slope == Double.MIN_VALUE){
        //             slope = curSlope;
        //         }else if(curSlope != slope){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        int dy = coordinates[1][1] - coordinates[0][1];
        int dx = coordinates[1][0] - coordinates[0][0];
        for(int i=2; i<coordinates.length; i++){
            int curr_dy = coordinates[i][1] - coordinates[i-1][1];
            int curr_dx = coordinates[i][0] - coordinates[i-1][0];

            if(dy*curr_dx != dx*curr_dy) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[][] coordinates = {{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}};
        System.out.println(checkStraightLine(coordinates));
    }
}
