import java.util.*;

public class SwapLL {
    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void display() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode swapList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = curr;

            if (prev == null) {
                head = temp;
            } else {
                prev.next = temp;
            }

            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        SwapLL ll = new SwapLL();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addFirst(8);
        ll.addFirst(6);
        ll.addFirst(4);
        ll.addFirst(2);

        ll.display();

        head = swapList(head);

        ListNode ans = head;
        while (ans != null) {
            System.out.print(ans.data + "-->");
            ans = ans.next;
        }
        System.out.print("null");
    }
}
