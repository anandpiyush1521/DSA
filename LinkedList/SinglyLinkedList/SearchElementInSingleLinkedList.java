public class SearchElementInSingleLinkedList{

    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean findKey(ListNode head, int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args){
       
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(19);
        ListNode fourth = new ListNode(36);

        head.next = second;
        second.next = third;
        third.next = fourth;

        SearchElementInSingleLinkedList sll = new SearchElementInSingleLinkedList();
        sll.display(head);

        System.out.println("");

        if(sll.findKey(head, 19)){
            System.out.println("Search Key Found");

        }else{
            System.out.println("Search key not found");
        }
    }
}