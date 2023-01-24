public class InsertNodeInSortedSinglyLinkedList{

    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegining(int value){
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

    public ListNode insertInSorted(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data<newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args){
        InsertNodeInSortedSinglyLinkedList sll = new InsertNodeInSortedSinglyLinkedList();
        sll.insertAtBegining(16);
        sll.insertAtBegining(10);
        sll.insertAtBegining(8);
        sll.insertAtBegining(1);

        sll.display();
        System.out.println("");
        sll.insertInSorted(11);
        sll.display();
    }
}