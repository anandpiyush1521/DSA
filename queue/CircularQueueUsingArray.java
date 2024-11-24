package com.sorting;

public class CircularQueueUsingArray {
    static int front;
    static int rear;
    static int size;
    static int capacity;
    static int[] arr;

    CircularQueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public static void enque(int value){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        if(size == 0){
            front = 0;
        }
        rear = (rear+1) % capacity;
        arr[rear] = value;
        size++;
    }

    public static int deque(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedElement = arr[front];
        front = (front+1) % capacity;
        size--;

        if(size == 0){
            front = -1;
            rear = -1;
        }
        return removedElement;
    }

    public static int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " <-- ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        CircularQueueUsingArray cq = new CircularQueueUsingArray(9);
        cq.enque(10);
        cq.enque(20);
        cq.enque(30);
        cq.enque(40);
        cq.enque(50);

        display();

        System.out.println("Deque Operation");
        System.out.println(deque());

        System.out.println("Peek Operation");
        System.out.println(peek());

        display();
    }
}
