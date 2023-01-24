public class NodeAtAnyPosition{
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAny(int position, int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        } else{
            ListNode previous = head;
            int count=1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
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

    public int printCount(){
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
        NodeAtAnyPosition sll = new NodeAtAnyPosition();
        sll.insertAny(1, 8);
        sll.insertAny(2, 9);
        sll.insertAny(1, 10);
        sll.insertAny(2, 11);

        sll.display();
        System.out.println("");
        System.out.println("The length of list is " + sll.printCount());
    }
}