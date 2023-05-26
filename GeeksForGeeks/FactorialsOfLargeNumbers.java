/* Given an integer N, find its factorial. return a list of integers denoting the digits that make up the factorial of N.

Example 1:
Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120

Example 2:
Input: N = 10
Output: 3628800
Explanation : 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800           */


import java.util.*;
public class FactorialsOfLargeNumbers{
    public static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        for(int i=2; i<=N; i++){
            int carry =0;
            for(int j=0; j<list.size(); j++){
                int val = (list.get(j)*i) + carry;
                carry = val/10;
                list.set(j, val%10);
            }
            while(carry != 0){
                list.add(carry%10);
                carry = carry/10;
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(factorial(n));
    }
}

// https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1?page=1&company[]=Philips&sortBy=submissions

    