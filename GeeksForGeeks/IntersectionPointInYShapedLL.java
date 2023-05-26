import java.util.*;
public class IntersectionPointInYShapedLL{
    public static Node head;
    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void insertAtLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public static Node intersection(Node head1, Node head2){
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        if(len1 > len2){
            head1 = advance(head1, len1-len2);
        }else{
            head2 = advance(head2, len2-len1);
        }

        while(head1!=null && head2!=null){
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
    public static int getLength(Node head){
        int count=0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static Node advance(Node head, int count){
        while(count-- > 0){
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args){
        IntersectionPointInYShapedLL ll1 = new IntersectionPointInYShapedLL();
        IntersectionPointInYShapedLL ll2 = new IntersectionPointInYShapedLL();
        ll1.insertAtLast(3);
        ll1.insertAtLast(6);
        ll1.insertAtLast(9);
        ll1.insertAtLast(15);
        ll1.insertAtLast(30);

        ll1.display();
        System.out.println("");
        ll2.insertAtLast(10);
        ll2.insertAtLast(15);
        ll2.insertAtLast(30);

        ll2.display();
        System.out.println("");

        System.out.println(intersection(ll1.head, ll2.head));
    }
}