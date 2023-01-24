public class MiddleNodeOfSingleLinkedList{

    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int value){
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

    public ListNode findMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null || fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args){
        MiddleNodeOfSingleLinkedList sll = new MiddleNodeOfSingleLinkedList();
        sll.insertFirst(1);
        sll.insertFirst(13);
        sll.insertFirst(19);
        sll.insertFirst(20);
        sll.insertFirst(2);

        sll.display();
        System.out.println("");

        ListNode middleNode = sll.findMiddleNode();
        System.out.println("The middle node is " + middleNode.data);

        

    }
}