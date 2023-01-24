public class MergeTwoSortedSinglyLinkedList{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!=null && b!=null){
            if(a.data < b.data){
                tail.next= a;
                a = a.next;
            } else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        } else{
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        MergeTwoSortedSinglyLinkedList sll1 = new MergeTwoSortedSinglyLinkedList();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);

        MergeTwoSortedSinglyLinkedList sll2 = new MergeTwoSortedSinglyLinkedList();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);

        sll1.display();
        System.out.println("");
        sll2.display();

        System.out.println("");

        MergeTwoSortedSinglyLinkedList result = new MergeTwoSortedSinglyLinkedList();
        result.head = merge(sll1.head, sll2.head);
        result.display();
    }
}