import java.util.*;
public class PartitionLL{
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
            System.out.println("Null");
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static ListNode partition(ListNode head, int x) {
        ArrayList<ListNode> list1 = new ArrayList<>();
        ArrayList<ListNode> list2 = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            if(curr.data < x){
                list1.add(curr);
            }else{
                list2.add(curr);
            }
            curr = curr.next;
        }
        list1.addAll(list2);

        return convFromList(list1);
    }

    public static ListNode convFromList(ArrayList<ListNode> list){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i = 0; i < list.size(); i++){
            curr.next = new ListNode(list.get(i).data); // Create a new node with the value
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        PartitionLL ll = new PartitionLL();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(2);

        // ll.display();
        
        int x = 3;
        ListNode newNode = ll.partition(ll.head, x);

        // ll.display();
        ListNode curr = newNode;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}