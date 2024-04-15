import java.util.*;
public class NandMLL{
    static ListNode head;

    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public static void addLast(int data){
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
    public static void display(){
        if(head == null){
            System.out.println("NULL");
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static ListNode newList(int n, int m, ListNode head){
        ListNode curr = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while(curr != null){
            for(int i=0; i<n && curr!=null; i++){
                list.add(curr);
                curr = curr.next;
            }
            for(int i=0; i<m && curr!=null; i++){
                curr = curr.next;
            }
        }               
        return listToLL(list);
    }
    public static ListNode listToLL(ArrayList<ListNode> list){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i=0; i<list.size(); i++){
            curr.next = new ListNode((list.get(i)).data);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        NandMLL ll = new NandMLL();
        
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.addLast(7);
        // ll.addLast(8);
        // ll.addLast(9);
        // ll.addLast(10);
        
        ll.addLast(9);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(9);
        ll.addLast(4);
        ll.addLast(10);
        ll.addLast(1);
        int n = 2;
        int m = 3;
        ListNode newNode = newList(n, m, ll.head);

        ListNode curr = newNode;
        while(curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}