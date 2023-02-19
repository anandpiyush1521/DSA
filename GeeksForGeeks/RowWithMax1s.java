/* Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:
Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing). */

import java.util.*;
public class RowWithMax1s{
    public static int rowWithMax1s(int arr[][], int n, int m){
        int oneCount = 0;
        int maxRow = -1;
        for(int i=0; i<n; i++){
            int rowOneCount=0;
            for(int j=0; j<m; j++){
                if(arr[i][j] == 1){
                    rowOneCount++;
                }
            }
            if(rowOneCount > oneCount){
                oneCount = rowOneCount;
                maxRow = i;
            }
        }
        return maxRow;
    }
    public static void main(String[] args){
        int[][] arr = {{0, 1, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0}};
        int n = 4;
        int m = 4;

        System.out.println(rowWithMax1s(arr, n, m));
    }
}