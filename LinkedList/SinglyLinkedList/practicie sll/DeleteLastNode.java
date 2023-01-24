public class DeleteLastNode{
    
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insetLast(int value){
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

    public ListNode deleteLastNode(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static void main(String[] args){
        DeleteLastNode sll = new DeleteLastNode();
        sll.insetLast(450);
        sll.insetLast(12);
        sll.insetLast(10);
        sll.insetLast(1);
        sll.insetLast(23);

        sll.display();
        System.out.println("");
        System.out.println(sll.deleteLastNode().data);
        sll.display();
    }
}