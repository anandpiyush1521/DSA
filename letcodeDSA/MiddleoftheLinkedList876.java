import java.util.*;
public class MiddleoftheLinkedList876{
    public ListNode middleNode(ListNode head){
        ListNode middleNode = head;
        ListNode endNode = head;
        while(endNode!=null && endNode.next!=null){
            middleNode = middleNode.next;
            endNode = endNode.next.next;
        }
        return middleNode;
    }
}