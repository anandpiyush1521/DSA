/* Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

Example 1:
Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15                                 */

import java.util.*;
public class IntersectionPointYShapedLL{
    public static int findLength(Node head){
	    int len=0;
	    while(head != null){
	        len++;
	        head = head.next;
	    }
	    return len;
	}
	public static int intersectPoint(Node head1, Node head2)
	{
         int len1 = findLength(head1);
         int len2 = findLength(head2);
         int res = Math.abs(len1 - len2);
         if(len1 > len2){
             while(res > 0){
                 res--;
                 head1 = head1.next;
             }
         }else{
             while(res > 0){
                 res--;
                 head2 = head2.next;
             }
         }
         while(head1 != null){
             if(head1 == head2) break;
             
             head1 = head1.next;
             head2 = head2.next;
         }
         return head1.data;
	}
}