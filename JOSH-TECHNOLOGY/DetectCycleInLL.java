import java.util.*;
public class DetectCycleInLL{
    static ListNode head;

    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public static void addData(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public static void printLL(){
        if(head == null){
            System.out.println("null");
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static ListNode pairwiseSwap(ListNode head)
    {
        // code here
        if(head == null || head.next==null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        
        while(curr != null){
            list.add(curr.data);
            curr = curr.next;
        }
        swapPairs(list);
        return fromLL(list);
    }
    public static void swapPairs(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i+=2){
            Collections.swap(list, i, i+1);
        }
    }
    public static ListNode fromLL(ArrayList<Integer> list){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        for(int i=0; i<list.size(); i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        DetectCycleInLL ll = new DetectCycleInLL();
        ll.addData(1);
        ll.addData(2);
        ll.addData(2);
        ll.addData(4);
        ll.addData(5);
        ll.addData(6);
        ll.addData(7);
        ll.addData(8);

        // ll.printLL();
        ListNode newNode = pairwiseSwap(ll.head);
        ListNode curr = newNode;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}