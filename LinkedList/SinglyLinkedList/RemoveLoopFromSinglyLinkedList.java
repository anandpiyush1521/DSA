public class RemoveLoopFromSinglyLinkedList{

    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void createLoopInSinglyLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean detectLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public ListNode detectStartOfLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartOfLoop(slowPtr);
            }
        }
        return null;
    }

    public ListNode getStartOfLoop(ListNode slowPtr){
        ListNode temp = head;
        while(slowPtr!=temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr!=null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }

    public void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while(slowPtr.next != temp.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public static void main(String[] args){
        RemoveLoopFromSinglyLinkedList sll = new RemoveLoopFromSinglyLinkedList();
        sll.createLoopInSinglyLinkedList();
        // sll.display();
        System.out.println("");
        System.out.println(sll.detectLoop());
        System.out.println(sll.detectStartOfLoop().data);

        sll.removeLoop();
        sll.display();
    }
}