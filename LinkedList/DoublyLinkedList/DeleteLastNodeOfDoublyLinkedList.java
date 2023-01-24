import java.util.NoSuchElementException;

public class DeleteLastNodeOfDoublyLinkedList{
    public ListNode head;
    public ListNode tail;
    public int length;

    public static class ListNode{
        public int data;
        public ListNode next;
        public ListNode previous;
        
        public ListNode(int data){
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        } else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayBackward(){
        ListNode current = tail;
        if(tail == null){
            return;
        }
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.print("null");
    }

    public void displayForward(){
        ListNode current = head;
        if(head == null){
            return;
        }
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode deleteLastNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        } else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }

    public static void main(String[] args){
        DeleteLastNodeOfDoublyLinkedList dll = new DeleteLastNodeOfDoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(6);
        dll.insertLast(9);

        dll.displayForward();
        System.out.println("");
        dll.displayBackward();

        dll.deleteLastNode();

        System.out.println("");
        dll.displayForward();
    }
}