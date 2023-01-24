public class DeleteFirstNode{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    /*
    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }  */

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

    public ListNode deleteFirstNode(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args){
        DeleteFirstNode sll = new DeleteFirstNode();
        sll.insertLast(5);
        sll.insertLast(54);
        sll.insertLast(12);
        sll.insertLast(1);
        sll.insertLast(36);

        sll.display();
        System.out.println("");
        System.out.println(sll.deleteFirstNode().data);
        sll.display();
    }
}