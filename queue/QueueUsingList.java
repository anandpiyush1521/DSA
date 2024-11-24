package com.sorting;

public class QueueUsingList {
    static Node root;
    public QueueUsingList() {
        this.root = null;
    }

    public static boolean isEmpty() {
        return root == null;
    }

    public static void enQueue(int val) {
        Node newNode = new Node(val);
        if(root == null) {
            root = newNode;
        }else {
            Node temp = root;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(val + " is enqueued in queue");
    }

    public static void deQueue() {
        if(isEmpty()) {
            return;
        }
        int deQueued = root.data;
        root = root.next;
        System.out.println(deQueued + " is dequeued from queue");
    }

    public static void peek() {
        if(isEmpty()) {
            return;
        }
        System.out.println(root.data + " is peeked from queue");
    }

    public static void display() {
        if(isEmpty()) {
            return;
        }
        Node temp = root;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        QueueUsingList qu = new QueueUsingList();

        System.out.println("Enqueue operation:");
        qu.enQueue(12);
        qu.enQueue(16);
        qu.enQueue(78);
        qu.enQueue(89);
        qu.enQueue(138);

        display(); 

        System.out.println("Dequeue operation:");
        deQueue();
        peek();

        display();
    }

}

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
