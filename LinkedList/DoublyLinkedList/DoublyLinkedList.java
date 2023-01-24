
public class DoublyLinkedList{

    public ListNode head;
    public ListNode tail;
    public int length;

    public class ListNode{
        public int data;
        public ListNode next;
        public ListNode previous;

        //constructor
        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.next = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; // head = null;
    }

    public int length(){
        return length;
    }
} 