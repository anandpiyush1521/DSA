/*  You are given the head of a linked list. You have to replace all the values of the nodes with the nearest prime number. If more than one prime number exists at an equal distance, choose the smallest one.

Example 1:
Input:
2 → 6 → 10
Output:
2 → 5 → 11
Explanation:
The nearest prime of 2 is 2 itself.
The nearest primes of 6 are 5 and 7,
since 5 is smaller so, 5 will be chosen.
The nearest prime of 10 is 11.                      */

import java.util.*;
public class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
public class PrimeList{
    public static Node primeList(Node head){
        Node curr = head;
        while(curr != null){
            int n = curr.val;
            if(n == 1){
                curr.val = 2;
            }else if(! isPrime(n)){
                if(n - minVal(n) > maxVal(n) - n){
                    curr.val = maxVal(n);
                }else{
                    curr.val = minVal(n);
                }
            }
            curr = curr.next;
        }
        return head;
    }
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int minVal(int num){
        for(int i=num; i>=2; i--){
            if(isPrime(i) == true) return i;
        }
        return num;
    }
    public static int maxVal(int num){
        for(int i=num+1; i<2*num; i++){
            if(isPrime(i) == true) return i;
        }
        return num;
    }
}