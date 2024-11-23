package com.dll;

public class DoubleLinkedList {
    static ListNode head;
    static ListNode tail;

    public static void insertNodeAtFirst(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public static void insertNodeAtLast(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void insertNodeAfterGivenNode(int node, int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        if(node == tail.data){
            insertNodeAtLast(val);
            return;
        }
        ListNode curr = head;
        ListNode temp = head;
        while(curr.next!=null){
            temp = curr.next;
            if(curr.data == node){
                break;
            }
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = temp;
        temp.prev = newNode;
        newNode.prev = curr;
    }

    public static void deletFirstNode(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public static void deleteLastNode(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void deleteGivenNode(int node){
        if(head == null){
            System.out.println("List is empty");
        }
        ListNode curr = head;
        if(curr.data == node){
            deletFirstNode();
            return;
        }

        while(curr.next != null){
            if(curr.data == node){
                if(curr == tail){
                    deleteLastNode();
                    return;
                }else{
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                return;
            }
            curr = curr.next;
        }

    }

    public static void displayForward(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        head = null;
        tail = null;

        insertNodeAtFirst(5);
        insertNodeAtFirst(10);
        insertNodeAtFirst(15);
        insertNodeAtFirst(20);

        insertNodeAtLast(65);

        insertNodeAfterGivenNode(10, 80);
        insertNodeAfterGivenNode(20, 90);

        displayForward();

        // deletFirstNode();

        // deleteLastNode();

        deleteGivenNode(80);
        
        displayForward();

    }
}

class ListNode{
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(int data){
        this.data = data;
    }
}
