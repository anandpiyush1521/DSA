public class DeleteNodeAtGiven{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtPosition(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        } else{
            ListNode temp = head;
            int count = 1;
            while(count<position-1){
                temp = temp.next;
                count++;
            }
            ListNode current = temp.next;
            node.next = current;
            temp.next = node;
        }
    }

    public void display(){
        ListNode current =head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void deleteNodeAtGiven(int position){
        if(position == 1){
            head = head.next;
        } else{
            ListNode temp = head;
            int count=1;
            while(count<position-1){
                temp = temp.next;
                count++;
            }
            ListNode current = temp.next;
            temp.next = current.next;
        }
    }
    

    public static void main(String[] args){
        DeleteNodeAtGiven sll = new DeleteNodeAtGiven();
        sll.insertAtPosition(1, 8);
        sll.insertAtPosition(2, 9);
        sll.insertAtPosition(1, 54);
        sll.insertAtPosition(4, 878);
        sll.insertAtPosition(3, 14);


        sll.display();
        System.out.println("");
        sll.deleteNodeAtGiven(3);
        sll.display();
        
    }
}