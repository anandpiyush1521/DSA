/**
 * 
 * Problem Statement-
 * [Drawing Book](week-3 => 3 month kit)        
 * 
 */

import java.util.*;
public class DrawingBook{
    public static int pageCount(int n, int p){
        int turnFromFront = p/2;
        int turnFromBack = n/2 - turnFromFront;
        return Math.min(turnFromBack, turnFromFront);
    }
    public static void main(String[] args){
        int n = 5;
        int p = 3;
        System.out.println(pageCount(n, p));
    }
}