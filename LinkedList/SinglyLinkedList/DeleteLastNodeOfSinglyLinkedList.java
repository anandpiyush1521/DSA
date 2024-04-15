public class DeleteLastNodeOfSinglyLinkedList{
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAnyPosition(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        } else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode deleteLastNodeOfSinglyLinkedList(){
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
        DeleteLastNodeOfSinglyLinkedList sll = new DeleteLastNodeOfSinglyLinkedList();
        sll.insertAnyPosition(1, 8);
        sll.insertAnyPosition(0, 9);
        sll.insertAnyPosition(1, 16);
        sll.insertAnyPosition(3, 87);

        sll.display();

        System.out.println("");

        System.out.println(sll.deleteLastNodeOfSinglyLinkedList().data);

        sll.display();
    }
}