public class LinkedList1 {
    public static ListNode head;

    static class ListNode {
        String data;
        ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert at beginning
    public static void insertNode(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insert at last
    public static void insertAtLast(String data) {
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

    public static void printLinkedList() {
        if (head == null) {
            System.out.println("Null");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        // LinkedList1 ll = new LinkedList1();
        // ll.insertNode("16");
        // ll.insertNode("10");
        // ll.insertNode("18");
        // ll.insertNode("1");

        // ll.printLinkedList();
        

        // insertNode("16");
        // insertNode("10");
        // insertNode("18");
        // insertNode("1");

        // printLinkedList();

        insertNode("a");
        insertNode("is");

        printLinkedList();

        insertAtLast("list");
        printLinkedList();
    }
}
