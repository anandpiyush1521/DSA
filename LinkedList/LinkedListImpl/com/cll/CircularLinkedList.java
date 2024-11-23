package com.cll;

public class CircularLinkedList {
    static ListNode last;

    public static void insertAtFirst(int val){
        ListNode newNode = new ListNode(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public static void insertAtLast(int val){
        ListNode newNode = new ListNode(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public static void insertAfterGivenNode(int node, int val){
        ListNode newNode = new ListNode(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }
        if(last.data == node){
            insertAtLast(val);
            return;
        }
        ListNode curr = last.next;
        ListNode temp = last.next;

        while(curr.next != null){
            temp = temp.next;
            if(curr.data == node){
                break;
            }
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = temp;
    }

    public static void deleteFirstNode(){
        if(last == null){
            System.out.println("List is empty.");
            return;
        }
        ListNode head = last.next;
        if(head == last){
            last = null;
        }else{
            last.next = head.next;
        }
    }

    public static void deleteLastNode(){
        if(last == null){
            System.out.println("List is empty.");
            return;
        }
        ListNode head = last.next;
        if(head == last){
            last = null;
        }
        ListNode curr = head;
        while(curr.next != last){
            curr = curr.next;
        }
        curr.next = head;
        last = curr;
    }

    public static void deleteGivenNode(int node){
        if(last == null){
            System.out.println("List is empty.");
            return;
        }
        ListNode head = last.next;
        
        if(head == last){
            last = null;
        }

        ListNode curr = head;
        while(curr.next!= null && curr.next.data != node){
            curr = curr.next;
        }
        if(curr.next == last){
            curr.next = last.next;
            last = curr;
        }else if(curr.next == null){
            System.out.println("Node not found.");
        }else{
            curr.next = curr.next.next;
        }
    }

    public static void display(){
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        ListNode start = last.next;
        ListNode temp = start;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != start); // Continue until we loop back to the first node
        System.out.println("(back to start)");
    }

    public static void main(String[] args){
        last = null;

        System.out.println("Inserting at first");
        insertAtFirst(10);
        insertAtFirst(20);
        insertAtFirst(30);
        insertAtFirst(40);
        insertAtFirst(50);

        display();


        System.out.println("Inserting at last");
        insertAtLast(60);
        insertAtLast(70);
        insertAtLast(80);
        insertAtLast(90);

        display();

        System.out.println("Inserting after given node");
        insertAfterGivenNode(60, 546);
        insertAfterGivenNode(90, 999);
        insertAfterGivenNode(50, 698);
        display();

        System.out.println("Deleting first node");
        deleteFirstNode();
        display();

        System.out.println("Deleting last node");
        deleteLastNode();
        display();

        System.out.println("Deleting given node");
        deleteGivenNode(546);
        display();

    }
}

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
    }
}
