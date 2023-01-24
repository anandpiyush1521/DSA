public class NodeAtBegining{
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertBegining(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }



    public static void main(String[] args){
        NodeAtBegining sll = new NodeAtBegining();
        sll.insertBegining(10);
        sll.insertBegining(20);
        sll.insertBegining(9);

        sll.display();
    }
}