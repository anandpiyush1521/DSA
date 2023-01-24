//Implementation of Single Linked List. 

public class SinglyLinkedList{

    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int printLength(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Now connect them together to form a chain
        sll.head.next = second; //10 -> 1
        second.next = third; //10 -> 1 -> 8
        third.next = fourth; //10 -> 1 -> 8 -> 11 -> null

        sll.display();
        System.out.println("");
        // int length = sll.printLength();
        System.out.println("The length of list is " + sll.printLength());
    }
}