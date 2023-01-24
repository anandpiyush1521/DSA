import java.util.*;
public class ValidBoomerang1037{
    public static boolean isBoomerang(int[][] points){
        if(points == null){
            return true;
        }
        // int m = points.length;
        // int n = points[0].length;
        // int[][] pointsList = new int[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         pointsList[i][j] = points[i][j];
        //     }
        // }
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(pointsList[i] == pointsList[j]){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        for(int i=2; i<points.length; i++){
            int x3 = points[i][0];
            int y3 = points[i][1];
            if((y3-y2)*(x2-x1) == (y2-y1)*(x3-x2)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        System.out.println(isBoomerang(points));
    }
}