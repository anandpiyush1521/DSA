public class singlelinkedlist{
    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
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

    public int printLength(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args){
        singlelinkedlist sll = new singlelinkedlist();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        
        sll.head.next = second;
        second.next = third;

        sll.display();
        System.out.println("");
        System.out.print("The length: " + sll.printLength());
    }
}