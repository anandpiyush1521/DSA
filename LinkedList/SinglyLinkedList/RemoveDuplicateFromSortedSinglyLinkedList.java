public class RemoveDuplicateFromSortedSinglyLinkedList{

    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("null");
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void removeDuplicate(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        RemoveDuplicateFromSortedSinglyLinkedList sll = new RemoveDuplicateFromSortedSinglyLinkedList();
        sll.insertAtBeginning(3);
        sll.insertAtBeginning(3);
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(1);

        sll.display();
        System.out.println("");
        sll.removeDuplicate();
        sll.display();
    }
}