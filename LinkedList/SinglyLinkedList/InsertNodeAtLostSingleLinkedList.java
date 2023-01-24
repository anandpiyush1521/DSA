public class InsertNodeAtLostSingleLinkedList{

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

    public static void main(String[] args){
        InsertNodeAtLostSingleLinkedList sll = new InsertNodeAtLostSingleLinkedList();
        sll.insertLast(10);
        sll.insertLast(56);
        sll.display();
    }
}