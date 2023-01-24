import java.util.NoSuchElementException;

public class DeleteFirstNodeOfDoublyLinkedList{

    public ListNode head;
    public ListNode tail;
    public int length;

    public static class ListNode{
        public int data;
        public ListNode next;
        public ListNode prev;

        public ListNode(int data){
            this.data = data;
        }
    }


    public boolean isEmpty() {
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertNodeAtLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
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

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        } else{
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args){
        DeleteFirstNodeOfDoublyLinkedList dll  = new DeleteFirstNodeOfDoublyLinkedList();
        dll.insertNodeAtLast(1);
        dll.insertNodeAtLast(10);
        dll.insertNodeAtLast(15);
        dll.insertNodeAtLast(6);

        dll.displayForward();

        dll.deleteFirst();

        System.out.println("");

        dll.displayForward();

    }
}