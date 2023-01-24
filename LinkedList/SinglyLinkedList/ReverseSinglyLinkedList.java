public class ReverseSinglyLinkedList{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode temp = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;
        }
        return temp;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(121);
        ListNode fourth = new ListNode(6);
`
        head.next = second;
        second.next = third;
        third.next = fourth;

        ReverseSinglyLinkedList sll = new ReverseSinglyLinkedList();
        sll.display(head);

        System.out.println("");

        ListNode reverselist = sll.reverse(head);
        sll.display(reverselist);
    }
}