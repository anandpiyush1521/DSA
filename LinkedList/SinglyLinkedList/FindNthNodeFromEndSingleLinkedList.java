public class FindNthNodeFromEndSingleLinkedList{

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
            current = current.next;
        }
        current.next = newNode;
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

    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid value: " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args){
        FindNthNodeFromEndSingleLinkedList sll = new FindNthNodeFromEndSingleLinkedList();
        sll.insertLast(5);
        sll.insertLast(54);
        sll.insertLast(21);
        sll.insertLast(1);
        sll.insertLast(98);

        sll.display();
        System.out.println("");
        ListNode nthNodeFromend = sll.getNthNodeFromEnd(2);
        System.out.println("Nth node from end is => " + nthNodeFromend.data);
    }
}