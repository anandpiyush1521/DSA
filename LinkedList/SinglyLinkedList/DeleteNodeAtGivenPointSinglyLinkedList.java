public class DeleteNodeAtGivenPointSinglyLinkedList{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void inserAtGivenPosition(int position, int value){

        ListNode node = new ListNode(value);
        if(position ==1){
            node.next=head;
            head = node;
        } else{
            ListNode previous = head;
            int count=1;
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

    public void deleteNodeAtGivenPointSinglyLinkedList(int position){
        if(position ==1){
            head = head.next;
        } else{
            ListNode temp = head;
            int count = 1;
            while(count< position-1){
                temp = temp.next;
                count++;
            }
            ListNode current = temp.next;
            temp.next=current.next;
        }
    }

    public static void main(String[] args){
        DeleteNodeAtGivenPointSinglyLinkedList sll = new DeleteNodeAtGivenPointSinglyLinkedList();
        sll.inserAtGivenPosition(1, 9);
        sll.inserAtGivenPosition(2, 56);
        sll.inserAtGivenPosition(3, 98);
        sll.inserAtGivenPosition(4, 45);
        sll.inserAtGivenPosition(2, 23);


        sll.display();
        System.out.println("");

        sll.deleteNodeAtGivenPointSinglyLinkedList(3);

        sll.display();
    }
}