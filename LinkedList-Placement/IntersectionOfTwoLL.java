import java.util.*;

public class IntersectionOfTwoLL {
    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        IntersectionOfTwoLL ll = new IntersectionOfTwoLL();
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(8);
        ll.addLast(4);
        ll.addLast(5);

        

        ll.display();
      
    }
}
