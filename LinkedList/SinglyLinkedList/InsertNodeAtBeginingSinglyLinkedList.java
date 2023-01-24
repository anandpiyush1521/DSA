public class InsertNodeAtBeginingSinglyLinkedList{
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
            System.out.print(current.data + " --> " );
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertOne(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args){
        InsertNodeAtBeginingSinglyLinkedList sll = new InsertNodeAtBeginingSinglyLinkedList();
        sll.insertOne(11);
        sll.insertOne(8);
        sll.insertOne(9);
        sll.insertOne(545);

        sll.display();
    }
}