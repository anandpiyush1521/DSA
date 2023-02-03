/* Given a binary matrix of dimensions  with R rows and C columns. Start from cell(0, 0), moving in the right direction. Perform the following operations: 

If the value of matrix[i][j] is 0, then traverse in the same direction and check the next value.
If the value of matrix[i][j] is 1, then update matrix[i][j] to 0 and change the current direction clockwise. ie - up, right, down, or left directions change to right, down, left, and up respectively.
Find the index of the cell where you will be forced to exit the matrix while performing the given traversal. 

Example 1:

Input:
matrix[][] = {{0,1},
              {1,0}}
R=2
C=2
Output: (1,1)          */

import java.util.*;
public class LastCellInMatrix{
    public static int [] endPoints(int [][]arr, int m, int n){
        int co[]=new int[2];
        int i=0,j=0;
        int p=arr.length;
        int q=arr[0].length;
        co[0]=0;
        co[1]=0;
        char dir='r';
        while(true){   
            if(arr[i][j]==0){
                if(dir=='r')j++;
                else if(dir=='u')i--;
                else if(dir=='d')i++;
                else if(dir=='l')j--;
            }
            else{
                arr[i][j]=0;
                if(dir=='r')dir='d';
                else if(dir=='u')dir='r';
                else if(dir=='d')dir='l';
                else if(dir=='l') dir='u';
                
            }
            if(i<0 || j<0 || i>=p || j>=q)break;
             co[0]=i;
             co[1]=j;
        }
        return co;
    }
    public static void main(String[] args){
        int[][] arr = {{0,1}, {1,0}};
        int r=2;
        int c=2;

        System.out.println(endPoints(arr, r, c));
    }
}