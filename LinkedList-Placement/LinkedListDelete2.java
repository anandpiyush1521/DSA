public class LinkedListDelete2{
    public static ListNode head;
    private static int size;

    LinkedListDelete2(){
        this.size=0;
    }

    public static class ListNode{
        String data;
        ListNode next;

        public ListNode(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public static void insertAtLast(String data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public static void display(){
        if(head == null){
            System.out.println("NULL");
            return;
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static void deleteAtFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public static void deleteAtLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        ListNode secondLast = head;
        ListNode lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public static int getSize(){
        return size;
    }
    public static void main(String[] args){
        insertAtLast("10");
        insertAtLast("16");
        insertAtLast("18");
        insertAtLast("1");

        display();

        deleteAtLast();
        System.out.println("");
        display();

        System.out.println("");

        System.out.println(getSize());
    }
}