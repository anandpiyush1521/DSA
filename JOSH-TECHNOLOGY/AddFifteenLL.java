import java.util.*;

public class AddFifteenLL {
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

    public static int convertLL(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode curr = head;
        while (curr != null) {
            sb.append(curr.data);
            curr = curr.next;
        }
        String res = sb.toString();

        int num = Integer.parseInt(res) + 15;
        return num;
    }

    public static ListNode answer(int num) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (num > 0) {
            int digit = num % 10;
            ListNode newNode = new ListNode(digit);
            current.next = newNode;
            current = current.next;
            num /= 10;
        }
        
        return reverse(dummy.next);
    }
    
    public static ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode current = node;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;

        // if(node==null || node.next==null){
        //     return node;
        // }
        // ListNode newNode = reverse(node.next);
        // node.next.next=node;//reverse the link
        // node.next=null;
        // return newNode;
    }

    public static void addFirstInAnswer(int data, ListNode temp) {
        ListNode newNode = new ListNode(data);
        if (temp == null) {
            temp = newNode;
            return;
        }
        newNode.next = temp;
        temp = newNode;
    }

    public static void main(String[] args) {
        AddFifteenLL ll = new AddFifteenLL();
        ll.addFirst(9);
        ll.addFirst(9);
        ll.addFirst(9);

        ll.display();
        System.out.println("");
        int num = convertLL(head);
        System.out.println(num);

        ListNode ans = answer(num);
        while(ans != null){
            System.out.print(ans.data + "-->");
            ans = ans.next;
        }
        System.out.print("null");
    }
}
