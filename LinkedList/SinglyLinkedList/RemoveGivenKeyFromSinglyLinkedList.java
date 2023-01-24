public class RemoveGivenKeyFromSinglyLinkedList{

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
        ListNode current = head;
        if(head == null){
            System.out.println("null");
        }
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data==key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
    }

    public static void main(String[] args){
        RemoveGivenKeyFromSinglyLinkedList sll = new RemoveGivenKeyFromSinglyLinkedList();
        sll.insertAtBeginning(16);
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(8);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(11);

        sll.display();
        System.out.println("");
        sll.deleteNode(10);
        sll.display();  
    }
}