import java.util.*;
public class LinkedList3Collections{
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("a");
        ll.addFirst("is");

        System.out.println(ll);

        // ll.addLast("this");
        ll.addFirst("this");
        ll.add("last");

        System.out.println(ll);

        System.out.println(ll.size());

        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i) + "-->");
        }
        System.out.println("null");

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);
    }
}