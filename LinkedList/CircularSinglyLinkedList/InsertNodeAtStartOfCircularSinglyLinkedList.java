public class InsertNodeAtStartOfCircularSinglyLinkedList{

    public ListNode last;
    public int length;

    public static class ListNode{
        public ListNode next;
        public int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public InsertNodeAtStartOfCircularSinglyLinkedList(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insertFirst(int value){
        ListNode temp = new ListNode(value);
        if(last == null){
            last = temp;
        } else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public static void main(String[] args){
        InsertNodeAtStartOfCircularSinglyLinkedList cll = new InsertNodeAtStartOfCircularSinglyLinkedList();
        cll.insertFirst(1);
        cll.insertFirst(10);
        cll.insertFirst(15);
        cll.insertFirst(12);
        cll.insertFirst(6);

        cll.display();
    }
}