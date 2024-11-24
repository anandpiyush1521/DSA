package com.sorting;

public class QueueUsingArray {
    static int[] arr;
    static int front, rear, capacity;

    QueueUsingArray(int size){
        front = 0;
        rear = -1;
        capacity = size;
        arr = new int[capacity];
    }

    public static void enqueue(int value) {
        if(rear == capacity-1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = value;
    }

    public static int dequeue() {
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public static void display(){
        if(front > rear){
            System.out.println("Queue is empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " <-- ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        QueueUsingArray qu = new QueueUsingArray(5);
        System.out.println("Enqueue Operation");
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        qu.enqueue(50);

        display();

        System.out.println("Dequeue Operation");
        System.out.println(dequeue());

        display();
    }

}
