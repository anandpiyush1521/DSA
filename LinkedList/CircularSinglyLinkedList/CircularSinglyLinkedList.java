public class CircularSinglyLinkedList{


    public ListNode last;
    public int length;

    public static class ListNode{
        public ListNode next;
        public int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if (last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data );
    }

    public static void main(String[] args){
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularSinglyLinkedList();
        cll.display();
    }
}