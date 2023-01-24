public class NodeAtLast{
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
            //1 --> 56
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

    public static void main(String[] args){
        NodeAtLast sll = new NodeAtLast();
        sll.insertLast(10);
        sll.insertLast(6);

        sll.display();
    }
}