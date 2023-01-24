public class PrintElementsOfDoublyLinkedList{

    public ListNode head;
    public ListNode tail;
    public int length;

    public class ListNode{
        public int data;
        public ListNode next;
        public ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    /* 
    public PrintElementsOfDoublyLinkedList(){
        this.head = 0;
        this.tail = 0;
        this.length = null;
    } */

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        } else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode current = tail;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        PrintElementsOfDoublyLinkedList dll = new PrintElementsOfDoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(65);

        dll.displayForward();
        System.out.println("");
        dll.displayBackward();
    }
}