public class InsertNodeAtBeginingOfDoublyLInkedList{

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


    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        } else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
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

    public static void main(String[] args){
        InsertNodeAtBeginingOfDoublyLInkedList dll = new InsertNodeAtBeginingOfDoublyLInkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.insertFirst(6);

        dll.displayBackward();
        System.out.println("");
        dll.displayForward();
    }
}