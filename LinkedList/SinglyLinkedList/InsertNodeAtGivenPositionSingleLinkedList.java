public class InsertNodeAtGivenPositionSingleLinkedList{

    public static ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  static ListNode insert(int position, int value){
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

    public static void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        InsertNodeAtGivenPositionSingleLinkedList sll = new InsertNodeAtGivenPositionSingleLinkedList();
        sll = insert(1, 8);

        sll.display();
    }
}