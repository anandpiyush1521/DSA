public class DeleteFirstNodeOfSinglyLinkedList{
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
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode deleteFirstNodeOfSinglyLinkedList(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args){
        DeleteFirstNodeOfSinglyLinkedList sll = new DeleteFirstNodeOfSinglyLinkedList();
        sll.insertLast(1);
        sll.insertLast(5);
        sll.insertLast(3);
        sll.insertLast(56);
        sll.insertLast(23);

        sll.display();
        System.out.println("");

        System.out.println(sll.deleteFirstNodeOfSinglyLinkedList().data);

        sll.display();
    }
}